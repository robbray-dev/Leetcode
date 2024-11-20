class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // loop through nums 1 with hashset, then loop through nums2 with hashset, if add is false then drop it from the hashset.
        //do the same for nums2
        List<List<Integer>> answer = new ArrayList<>();
        HashSet<Integer> nums1Hash = new HashSet<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());
        for(int i = 0; i < nums1.length; i++) {
            if(nums1Hash.add(nums1[i]) == true) {
                answer.get(0).add(nums1[i]);
            }
        }
        for(int i = 0; i < nums2.length; i++){
            if(nums1Hash.contains(nums2[i])){
                answer.get(0).remove(Integer.valueOf(nums2[i]));
            }
        }
        nums1Hash.clear();
        
        for(int i = 0; i < nums2.length; i++){
            if(nums1Hash.add(nums2[i])==true){
                answer.get(1).add(nums2[i]);
            }
        }
        for(int i = 0; i < nums1.length; i++){
            if(nums1Hash.contains(nums1[i])) {
                answer.get(1).remove(Integer.valueOf(nums1[i]));
            }
        }
        return answer;
    }
}