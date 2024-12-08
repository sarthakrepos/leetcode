class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end=x/2;
        int ans=0;
        if (x == 0 || x == 1) {
            return x;
        }

        while(start<=end){
            long mid=(start+end)/2;
            long val=mid*mid;

            if(val<=(long)x){
                ans=(int)mid;
                start=(int)mid+1;
            }
            else{
                end=(int)mid-1;
            }
            
        }
        return ans;
        
    }
}