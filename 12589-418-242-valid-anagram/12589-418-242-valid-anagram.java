class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sHashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!sHashMap.containsKey(s.charAt(i))) {
                sHashMap.put(s.charAt(i),1);
            } else {
                sHashMap.put(s.charAt(i), sHashMap.get(s.charAt(i))+1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if(sHashMap.containsKey(t.charAt(i))) {
                sHashMap.put(t.charAt(i), sHashMap.get(t.charAt(i))-1);
            } else {
                return false;
            }
        }

        for (Integer val : sHashMap.values()) {
            if(val!=0) {
                return false;
            }
        }
        return true;     
    }
}