class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;
        else{
           char scharArray[]=s.toCharArray();
           char tcharArray[]=t.toCharArray();
           Arrays.sort(scharArray);
           Arrays.sort(tcharArray);
           return(Arrays.equals(scharArray,tcharArray));
        }
    }
}