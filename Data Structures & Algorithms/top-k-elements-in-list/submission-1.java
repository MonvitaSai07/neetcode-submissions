class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int nu : nums)
        {
            hm.put(nu,hm.getOrDefault(nu,0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for(Map.Entry<Integer,Integer> en : hm.entrySet()) 
        {
            pq.offer(en);
            if (pq.size() > k) {
                pq.poll();
            }
        }   
        int[] ans = new int[k];
        int i = 0;
        while (!pq.isEmpty()) {
            ans[i++] = pq.poll().getKey();
        }
        return ans;
    }
}