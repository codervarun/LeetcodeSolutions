import java.util.HashMap;

public class LongestSubstringWithAtmost2distinctchar {

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>(2);
        int loindex = 0;
        int maxcount = 0;

        for(int i=0; i<len; i++){
            Character currChar = s.charAt(i);
            if(!map.containsKey(currChar)){
                if(map.size() < 2){
                    map.put(currChar,i);
                }else {

                    //get the character whose position is lesser.
                    int lo = Integer.MAX_VALUE;
                    //Initializes with junk character.
                    Character loch = 'A';
                    for (Character ch : map.keySet()) {
                        if (map.get(ch) < lo) {
                            lo = map.get(ch);
                            loch = ch;
                        }
                    }
                    maxcount = Math.max(maxcount, i - loindex);
                    loindex = lo + 1;
                    map.remove(loch);
                    map.put(currChar, i);
                }
            }else{
                //updating to the most recent position.
                map.put(currChar,i);
            }
        }

        maxcount = Math.max(maxcount,map.size());
        maxcount = Math.max(maxcount,len - loindex);


        return maxcount;
    }
}
