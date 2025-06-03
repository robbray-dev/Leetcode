class Solution {
    public int findKthLargest(int[] nums, int k) {
      //array of arraylist
      //make an array the size of nums and at each index will be an array list for the number in that posistion

      // array of arraylist
      // intialize it
      //loop through nums
      //place nums[i] at array[i].add(nums[i])

      //loop through and find the smallest value and the highest value.
      // make an array with that range
      // now just loop through nums and compare nums[i] - highestIndex,
      // get that index and that reperesent where to place that numbers counter in the array.
      //once done loop from the end of the array and traverse down until the counter is zero.

      int highestNumber = nums[0];
      int lowestNumber = nums[0];
      int range = 0;
      int tracker = k;
      


      for(int num : nums){
        highestNumber = Math.max(highestNumber, num);
        lowestNumber = Math.min(lowestNumber, num);
      }

      range = highestNumber - lowestNumber;
      int[] num_line = new int[range+1];

      for(int num : nums){
        int distance = num - highestNumber;
        int indexToPlace = range - Math.abs(distance);

      
        num_line[indexToPlace] = num_line[indexToPlace] + 1;

      }


      int i = num_line.length -1;
      int valueToReturn = 0;

      while(tracker>0 && i >=0){
        if(tracker > 0){
            //we know the highestIndex is length - 1, and its number is 6, so to solve this
            // we see the distance between i and length - 1, and use that difference to find the value to return, highest num - distance
            int distanceHere = range  - i;
            distanceHere = Math.abs(distanceHere);
            valueToReturn = highestNumber - distanceHere;

            tracker = tracker - num_line[i];

        }
        i--;
      }

      return valueToReturn;
      
    }
}