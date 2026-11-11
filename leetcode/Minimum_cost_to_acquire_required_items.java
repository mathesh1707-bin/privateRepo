//3789. Minimum_cost_to_acquire_required_items
// Approach 1 : 2ms
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1;
        long c2 = cost2;
        long cb = costBoth;
        long n1 = need1;
        long n2 = need2;
        long s1 = c1 * n1 + c2 * n2;
        long max = Math.max(n1, n2);
        long min = Math.min(n1, n2);
        long s2 = max * cb;
        long s3 = 0;
        if (min == n2) {
            n1 = n1 - min;
            s3 += n2 * cb + c1 * n1;
        } else {
            n2 = n2 - min;
            s3 += n1 * cb + c2 * n2;
        }
        long result = Math.min(s1, Math.min(s2, s3));
        return result;
    }
}

//Approach 2:2ms same idea but somewhat clear
class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long c1 = cost1, c2 = cost2, cb = costBoth;
        long n1 = need1, n2 = need2;
        long pairs = Math.min(n1, n2);
        long costPairs = pairs * Math.min(cb, c1 + c2);
        long rem1 = n1 - pairs;
        long rem2 = n2 - pairs;
        long costRem = rem1 * Math.min(c1, cb) + rem2 * Math.min(c2, cb);
        return costPairs + costRem;
    }
}
