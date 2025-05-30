class Solution {
    //brute force is nested for loop and check for each number 1-n
    //to have a hashset the array and then loop 1 - n to see if each number is in there
 
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : nums){
            numsSet.add(num);
        }

        for(int i = 1; i <= nums.length; i++){
            if(!numsSet.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
    

}