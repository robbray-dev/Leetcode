class Solution {
    public int longestConsecutive(int[] nums) {
        //hashset the nums array
        // start from the beginning of the sequence
        // then see if the next number exist and then the next and so forth.
        // once the sequence stops store it and compare it to the previous highest seqeunce.

        int highestSequence = 0;
        int lengthOfSeq = 1;

       
        HashSet<Integer> numsSet = new HashSet<>();

        for(int ele : nums){
            numsSet.add(ele);
        }
        for(int number : numsSet){
            if(!numsSet.contains(number - 1)){
                while(numsSet.contains(number+lengthOfSeq)){
                    lengthOfSeq++;
                }
                System.out.println(lengthOfSeq);
                if(lengthOfSeq>highestSequence){
                    highestSequence = lengthOfSeq;
                }
                lengthOfSeq = 1;
            }
        }

        return highestSequence;

    }
}