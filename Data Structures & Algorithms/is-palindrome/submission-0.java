class Solution {
    public boolean isPalindrome(String s) {
        int i = 0 ;
        int j = s.length() - 1;
        s = s.toLowerCase();
        while(i < j){
            char start = s.charAt(i);
            char end = s.charAt(j);
            if(!((start >= 'a' && start <= 'z') || (start >= '0' && start <= '9'))){
                i++;
                continue;
            }
            else if(!((end >= 'a' && end <= 'z') || (end >= '0' && end <= '9'))){
                j--;
                continue;
            }

            else if(start != end) return false;
            else{
                i++;;
                j--;
            }
        }
        return true;
    }
}
