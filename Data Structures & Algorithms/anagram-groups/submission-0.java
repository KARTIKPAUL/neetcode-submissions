class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

      Map<String,List<String>> map = new HashMap<>();

      for(String word : strs){
        int count[] = new int[26];

        for(char ch : word.toCharArray()){
            int pos = ch - 'a';
            count[pos]++;
        }
        String key = Arrays.toString(count);

        if(!map.containsKey(key)){
            List<String> newList = new ArrayList<>();
            map.put(key,newList);
        }

        List<String> list = map.get(key);
        list.add(word);
      }

      List<List<String>> answer = new ArrayList<>();
      for(List<String> list : map.values()){
        answer.add(list);
      }
      return answer;

    }
}
