class Solution {
    public int numSquares(int n) {
        // this is the lagrange 4 number theorem
        // time complexity:o(root(n))
        //Space Complexity:o(1)
        while(n%4 == 0)  n /= 4;
        if(n%8 == 7) return 4;
        for(int x=0; x*x <=n; x++){
            int y = (int)Math.sqrt(n - x*x);
            if(x*x + y*y == n){
                if(x == 0 || y == 0) return 1;
                else return 2;
            }
        }
        return 3;
    }
}
