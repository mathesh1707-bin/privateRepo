import java.util.*;
public class Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        
        int left=0;
        int right=0;
        while (right <= n - 1) {
            if (nums[right] == 0) {
                right++;
            } else if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right++;
            }
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
    }
}
