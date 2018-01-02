public class ValidPalindromeII {

    public boolean validPalindrome(String s){
        int n = s.length();
        int i =0;
        int j= n-1;
        while(i<j){
            if(s.charAt(i)== s.charAt(j)){
                i++;
                j--;
            }else{
                return (validP(s,i+1, j) || validP(s,i, j-1));
            }
        }
        return true;
    }


    public boolean validP(String s, int l , int r){
        while(l<r){
            if(s.charAt(l)== s.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
