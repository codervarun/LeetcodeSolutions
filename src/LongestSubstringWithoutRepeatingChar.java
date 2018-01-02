import java.util.HashMap;

public class LongestSubstringWithoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int k=0;
        int maxcount=0;
        int i=0;
        for(i=0; i<len; i++){
            Character currChar = s.charAt(i);
            if(!map.containsKey(currChar)){
                map.put(currChar,i);
            }else {
                int previndex = map.get(currChar);
                map.put(currChar,i);
                if(previndex < k){
                    continue;
                }
                if(maxcount < (i-k)){
                    maxcount = i-k;
                }
                k = previndex +1;
                if(s.charAt(i)== s.charAt(k) && i!=k){
                    k +=1;
                }

            }
        }
        if(maxcount < (i-k)){
            maxcount = i-k;
        }

        return maxcount;
    }
}
