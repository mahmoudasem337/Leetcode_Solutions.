class Solution {
    public boolean isSubsequence(String s, String t) {
        //O(N),O(1)
        int temp1=0;
        int temp2=0;
        if(s.length()<=0)
            return true;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(temp1)){
                temp1++;
                temp2++;
            }
            if(temp2==s.length()){
                return true;
            }
        }
        return false;
    }
}