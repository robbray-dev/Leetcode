class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force: nested loop and check if each combo expect for same indicies = target
        //optimal: loop through the arr, use a hashmap to store each element and its index, then check if the target - current element exists. if so return the two indicies.
        
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        int[] answer = new int[2]; 
        for(int i = 0; i < nums.length; i++){
            if(arrMap.containsKey(target - nums[i])){
                answer[0] = arrMap.get(target - nums[i]);
                answer[1] = i;
            }
            arrMap.put(nums[i], i);
        }
        return answer;
    }
}