class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m  = t.length();
        if(n != m) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i = 0 ; i < m ; i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.get(ch) - 1);
        }
        for(int i : map.values()){
            if(i != 0) return false;
        }
        return true;
    }
}
