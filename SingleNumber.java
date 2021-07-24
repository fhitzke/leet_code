import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        List<Integer> sNum = new ArrayList<>();
        for (int i : nums) {
            if (!sNum.contains(i)) {
                sNum.add(i);
            }
            else {
                sNum.remove(Integer.valueOf(i));
            }
        }
        return sNum.get(0);
    }
}
