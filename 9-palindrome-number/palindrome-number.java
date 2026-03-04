class Solution {
    public boolean isPalindrome(int x) {
        int dummy=x;
        int rev=0;
        int rem;
        while(dummy>0){
            rem=dummy%10;
            rev=rev*10+rem;
            dummy/=10;
        }
        return x==rev;
        
    }
}