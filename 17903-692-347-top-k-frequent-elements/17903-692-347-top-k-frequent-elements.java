class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // get the count of the elements
        //bucket sort, an array indexed from 0 to n + 1, any element can appear n times.
        //loop through the hashmap and place the key value in the corresponding bucket
        //array of array list.
   
        HashMap<Integer, Integer> counts = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1 );

        }
        

        int[] ans = new int[k];

        ArrayList<Integer>[] bucket = new ArrayList[nums.length+1];
        for(int i = 1; i < bucket.length; i++) {
            bucket[i] = new ArrayList<Integer>();
        }
        
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        //start from end, if the postions list is zero go to the next one.
        //once reached a viable position, loop through the position

        int tracker = 0;
        

        for(int i = bucket.length - 1; i > 0; i--) {
            if(bucket[i].size() == 0) {
                continue;
            } else {
                for(int j = 0; j < bucket[i].size(); j++){
                    if(tracker < k) {
                        ans[tracker] = bucket[i].get(j);
                        tracker++;
                    } 
                
                }
            }
        }

        return ans;

        
    }
}