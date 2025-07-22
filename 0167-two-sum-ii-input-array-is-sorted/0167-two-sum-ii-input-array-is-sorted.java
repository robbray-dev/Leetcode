class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //use two pointers, one at each end of the array
        //if the l + r > target, bring r down, if  l + r < target bring l up
        int l = 0;
        int r = numbers.length - 1;
        int[] ans = new int[2];

        while(l < r){
            if(numbers[l] + numbers[r] > target){
                r--;
            } else if(numbers[l] + numbers[r] < target){
                l++;
            } else{
                ans[0] = l + 1;
                ans[1] = r + 1;
                break;
            }
        }

        return ans;

    }
}