//347. Top K Frequent Elements
// Attempt 1: Brute-Force
class Solution1 {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> visited=new HashSet<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer> freq = new ArrayList<>(map.values());
        freq.sort(Comparator.reverseOrder());

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int target=freq.get(i);
            for(int num:map.keySet()){
                if(map.get(num)==target && !visited.contains(num)){
                    visited.add(num);
                    result[i]=num;
                    break;
                }
            }
        }

        return result;
    }
}

//Attemp 2: Optimal Bucket Sorting
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    res[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return res;
    }
}
