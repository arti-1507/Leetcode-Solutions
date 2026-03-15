class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        while(n>0){
            int a=n%10;
            n/=10;
            product*=a;
            sum+=a;
        }
        return product-sum;
        
    }
}