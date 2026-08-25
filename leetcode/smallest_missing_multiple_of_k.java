import java.util.HashSet;
import java.util.Set;

class Solution{
    public int missingMultiple(int[] nums, int k) {
        int x = k;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (i % k == 0) {
                set.add(i);
            }
        }
        while (set.contains(x)) {
            x += k;
        }
        return x;
    }
}