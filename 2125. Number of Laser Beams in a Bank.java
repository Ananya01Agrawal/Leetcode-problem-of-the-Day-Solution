class Solution {
    public int numberOfBeams(String[] bank) {
        int a=0,b=0,ans=0,count=0;
        for(int i=0;i<bank.length;i++){
            for(int j=0;j< bank[i].length();j++){
                if(bank[i].charAt(j)=='1')
                    count++;
            }
            if(count!=0){
                b=a;
                a=count;
                count=0;
            }
            if(a !=0 && b!=0){
                ans+=a*b;
                b=0;
            }
        }
        return ans;
    }
}
/*
Execution of the code that how it works

Initialize a = 0, b = 0, ans = 0, and count = 0.
Iterate through each row:
Row 1: Count devices with '1', count = 3. Update a = 3, b = 0, and reset count.
Row 2: Count devices with '1', count = 0. Update a = 0, b = 3, and reset count.
Row 3: Count devices with '1', count = 2. Update a = 2, b = 3, and reset count.
Row 4: Count devices with '1', count = 1. Update a = 1, b = 2, and reset count.
Calculate beams: ans += a * b = 8.
Return ans = 8 as the number of beams.
Complexity
Time complexity: O(rows * columns)
Space complexity: O(1)
*/
