import java.util.*;
public class Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
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
