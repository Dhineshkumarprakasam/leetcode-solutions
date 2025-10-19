class Solution {
    public String reverseStr(String s, int k) {
        if(s.length()<=1)
            return s;
        
        char str[] = s.toCharArray();
        for(int i=0;i<s.length();i+=2*k)
        {
            int l=i;
            int r=Math.min(i + k - 1, s.length() - 1);;
            while(l<r)
            {
                char temp = str[r];
                str[r]=str[l];
                str[l]=temp;
                l++;
                r--;
            }
        }

        return new String(str);
    }
}