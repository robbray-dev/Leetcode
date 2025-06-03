class Solution {
    public int missingNumber(int[] nums) {

        // get the expected count by adding 0 - n
        // subtract the expected count from the actual count
        // return the differnence if the counts aren't the same, else return 0, since zero is missing.
        int expectedCount = 0;
        int count = 0;

        for(int i = 0; i <= nums.length; i++){
            expectedCount += i;
        }

        for(int num : nums){
            count += num;
        }

        if(expectedCount != count){
            return expectedCount - count;
        } else {
            return 0;
        }


    }
}