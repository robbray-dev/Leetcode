class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // first apporach
       // what differnet values are in nums1 and nums2
        // get the unique values in nums1 with hashset one, then get the unique has values in nums2 with hashset two.
        // loop through the shortest array and see if the current value appears in the other array.
        // if so increment the count by one, then make arr of size counter, and loop through the
        
        // the apporach i ended up doing
        // get the unqiue elements in nums1 with hashset, then loop through nums2 and check if the current ele exist in nums1 hashset
        // if so then increment the count by 1. now loop through nums2 and check if the current ele is in the hashset of nums1,
        // if so populate the new arrary at  postion populator.

        int counter = 0;

        HashSet<Integer> nums1HashSet = new HashSet<>();
        HashSet<Integer> commonSet = new HashSet<>();

        for(int i = 0; i < nums1.length; i++) {
            nums1HashSet.add(nums1[i]);
        }



         for(int i = 0; i < nums2.length; i++) {
            if(nums1HashSet.contains(nums2[i])) {
                commonSet.add(nums2[i]);
            }
        }

        int[] answer = new int[commonSet.size()];
        int i = 0;

        for(int ele: commonSet){
            answer[i] = ele;
            i++;
        }

         return answer;

    }

}