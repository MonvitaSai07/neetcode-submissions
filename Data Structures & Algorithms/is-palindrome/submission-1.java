class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r)
        {
            while( l<r && !ap(s.charAt(l)) ) l++;
            while(r>l && !ap(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
         l++;
         r--;
        }
        return true;

    }
    public boolean ap(char c)
    {
        return ( c>='A' && c<='Z' || c>='a' && c<='z'|| c>='0' && c<='9' );
    }
}
