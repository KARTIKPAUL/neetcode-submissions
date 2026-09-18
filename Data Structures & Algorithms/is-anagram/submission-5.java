class Solution {
    public boolean isAnagram(String s, String t) {
      HashMap<Character,Integer> map1 = new HashMap<>();
      HashMap<Character,Integer> map2 = new HashMap<>();
      int n = s.length();
      int m = t.length();
      if(n != m) return false;

      for(int i = 0 ; i < n ; i++){
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);
        
        map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        
      }
     
      
      for(Character key : map1.keySet()){
        int val = map1.get(key);
        if(!map2.containsKey(key)) return false;
        else {
            int val2 = map2.get(key);
            if(val != val2) return false;
        }
      }

      return true;

    }
}
