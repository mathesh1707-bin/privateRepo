class Solution {
    public boolean squareIsWhite(String s) {
        return (s.charAt(0)+s.charAt(1)) % 2==0 ? false : true;
    }
}