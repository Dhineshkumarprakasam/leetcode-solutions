class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length()>2){
            StringBuilder str = new StringBuilder();
            for(int j=1;j<s.length();j++){
                str.append(((s.charAt(j-1)-'0')+(s.charAt(j)-'0'))%10);
            }
            s=str.toString();
        }

        if(s.length()==2 && s.charAt(0)==s.charAt(1)){
            return true;
        }

        return false;
    }
}