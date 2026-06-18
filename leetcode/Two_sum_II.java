import java.util.Scanner;

public class Two_sum {

    class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int n = numbers.length;
        int left = 0;
        int right = 0;
        while (right <= n - 1) {
            if (numbers[left] + numbers[right] == target) {
                
            }
        }
        return result;

    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        System.out.print(twoSum(nums,target));
    }
}
