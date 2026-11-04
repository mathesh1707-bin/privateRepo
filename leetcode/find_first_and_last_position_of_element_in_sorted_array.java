class Solution {
    public int[] searchRange(int[] arr, int target) {
        int st = -1;
        int lt = -1;
        int[] res = new int[2];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != target) {
                continue;
            }

            if (st == -1) {
                st = i;
            }

            lt = i;
        }

        res[0] = st;
        res[1] = lt;

        return res;
    }
}