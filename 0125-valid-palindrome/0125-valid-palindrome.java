class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
    if(Character.isLetterOrDigit(ch)){
        st += Character.toLowerCase(ch); 
        }
        }
        st=st.trim();
        int n=st.length();
        for(int i=0;i<n/2;i++){
            if(st.charAt(i)!=st.charAt(n-i-1))
                return false;
        }
        return true;
    }
}
