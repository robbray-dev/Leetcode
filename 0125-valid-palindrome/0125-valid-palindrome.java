class Solution {
    public boolean isPalindrome(String s) {
        //same forward as backwards
        //so remove non alphanumeric characters and have pointer
        // for front and back and see if they equal the same throughout the traversal.


         String traverseString = s.replaceAll("[^a-zA-Z0-9]", "");
         String tsL = traverseString.toLowerCase();
         

        int l = 0;
        int r = traverseString.length() -1;

        while(l < r){
            if (tsL.charAt(l)!= tsL.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }
}