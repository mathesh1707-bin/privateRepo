//3360.
class Solution {
    public boolean canAliceWin(int n) {
        int moves=10;
        int count=0;
        while(n>=moves){
            n-=moves;
            moves--;            
            count++;
        }
        return count%2==1;
    }
}
