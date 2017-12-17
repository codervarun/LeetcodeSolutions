class StrStr {
    public int strStr(String haystack, String needle) {
        if(haystack.isEmpty() && needle.isEmpty()){
            return 0;
        }
        if(haystack.isEmpty())
            return -1;
        if(needle.isEmpty()){
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();
        if(m>n){
            return -1;
        }
        int i=0,j=0;
        int start =i;
        int count=0;
        boolean foundpattern =false;

        while( i< n){
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
                count++;
                i++;
                if(count==(m)){
                    foundpattern =true;
                    break;
                }
            }else{
                j=0;
                count =0;
                i = start+1;
                start = i;
                continue;
            }
        }
        return foundpattern ? start : -1;
    }
}