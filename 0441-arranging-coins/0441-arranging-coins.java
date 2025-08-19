class Solution {
    public int arrangeCoins(int x) {
       long ans =0;
       long low= 1;
      long  high = x;
        while(low<=high){
           long mid = low+(high-low)/2;
          long sq = mid*(mid+1)/2;
            if(sq==x)return (int) mid;
            else if (sq>x) high = mid-1; // go left
            else 
            {ans = mid;
                low= mid+1;}
        } return (int)ans;
    }
}