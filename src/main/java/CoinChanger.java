import java.util.ArrayList;
import java.util.List;

public class CoinChanger {
    private static int[]currency = {25, 10, 5, 1};
    public List<Integer> makeChange(int amount) {
        ArrayList<Integer> change = new ArrayList<Integer>();

        for (int i=0; i<currency.length; i++){
            while (amount >= currency[i]){
                change.add(currency[i]);
                amount -= currency[i];
            }
        }
        return change;
    }
}
