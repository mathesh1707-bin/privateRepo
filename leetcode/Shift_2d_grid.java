import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n =grid[0].length;
        int size=m*n;
        int [] nums=new int [m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i*n+j]=grid[i][j];
            }
        }
        int st=0;
        int lt=size-1;
        k%=(size);
        
        while(st<lt){
            int temp=nums[st];
            nums[st]=nums[lt];
            nums[lt]=temp;
            st++;
            lt--;
        }
        int a=0;
        int b=k-1;
        while(a<b){
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
        int i=k;
        int j=size-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        List<List<Integer>> result=new ArrayList<>();
        for(int h=0;h<m;h++){
            List<Integer> row=new ArrayList<>();
            for(int g=0;g<n;g++){
                row.add(nums[h*n+g]);
            }
            result.add(row);
        }
        return result;
    }

}