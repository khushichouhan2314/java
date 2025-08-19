class Solution {
    public int mySqrt(int x) {
        int root = 0;
        for (int i = 0; i <= x; i++) {
            long sq = (long)i*i;
            if( sq > x) break;
               
            root = i;

           
        }
        return root;

    }
}