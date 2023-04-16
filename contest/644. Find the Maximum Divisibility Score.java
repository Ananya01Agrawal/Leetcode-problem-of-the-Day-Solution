// class Solution {
//     public int addMinimum(String word) {
//         int a = 0, b = 0, c = 0;
//         for (char ch : word.toCharArray()) {
//             if (ch == 'a') {
//                 a = Math.min(b, c) + 1;
//             } else if (ch == 'b') {
//                 b = Math.min(a, c) + 1;
//             } else {
//                 c = Math.min(a, b) + 1;
//             }
//         }
//         return word.length() - Math.max(a, Math.max(b, c));
//     }
// }
// // give anothe rsolution outpu coming worng




class Solution {
    
    public int maxDivScore(int[] nums, int[] divisors) {
        
        int maxDivisor = divisors[0];// initialising the maximum divisor as the first element
        
        int anuScore = 0;// initilize the maximum score as zero
        
        for (int divisor : divisors) {// traversing through the array
            
            int points = 0;// initilise the score as zero
            
            for (int num : nums) {// traversing throught tge nums array
                
                if (num % divisor == 0) {// checking the divisiblitity of number
                    
                    points++;// increase the points
                }
            }
            
            if (points > anuScore || (points == anuScore && divisor < maxDivisor)) {// cheking the condition
                
                anuScore = points;// here we are just swapping out the values
                
                maxDivisor = divisor;
            }
        }
        
        return maxDivisor;// return the max divisor
    }
} 
