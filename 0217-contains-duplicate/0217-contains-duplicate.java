class Solution {
    public boolean containsDuplicate(int[] nums) {
        //use a hashset to add the values in nums and if add returns false then there is a duplicate.
        
        HashSet<Integer> numsSet = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            if(numsSet.add(nums[i])==false){
                return true;
            }
        }
        return false;
    }
}