class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int original=x;
            int new_x = 0;
            while(x!=0){
            int y=x%10;
            new_x=new_x*10+y;
            x=x/10;
            }
            return original==new_x;
            
            
        }
        
    }
}