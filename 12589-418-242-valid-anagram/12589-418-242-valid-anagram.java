class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character, Integer> sHashMap = new HashMap<>();

    
      //does t have the same letter count as s.
      //loop through s, and deduct each occurence if its present in t.

      // loop through t and if the value exist in s then decrement it.
      // make sure that s hashmap has no values other than 0, if it does have only zeros return true.
      

      for(int i = 0; i < s.length(); i++) {
        sHashMap.put(s.charAt(i), sHashMap.getOrDefault(s.charAt(i),0) + 1);

      }

      for(int i = 0; i < t.length(); i++) {
        if(sHashMap.containsKey(t.charAt(i))) {
            sHashMap.put(t.charAt(i), sHashMap.get(t.charAt(i))  - 1);
        } else {
            return false;
        }
      }

      for(int i = 0; i < s.length(); i++) {
        if(sHashMap.get(s.charAt(i)) != 0) {
            return false;
        } else {
            continue;
        }
      }
    
    return true;

    }
}
