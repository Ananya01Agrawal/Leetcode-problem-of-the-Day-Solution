class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        /*
        he method minExtraChar takes the string s and an array of words dictionary as input and returns the minimum number of extra characters.

A HashSet named anan is initialized to store the words from the dictionary array.

The length of the string s is stored in the variable n.

An integer array dip is created with a size of n + 1, where dip[i] represents the minimum number of extra characters for the substring ending at index i of the string s. The initial values are set such that dip[0] = 0 and dip[i] = dip[i - 1] + 1 for i from 1 to n. This means that initially, each substring of length i has i extra characters.

The code then uses two nested loops to iterate through the string s. The outer loop iterates from 1 to n, representing the end index of the substring.

Inside the outer loop, the inner loop iterates from the current end index i to 1, representing the start index of the substring.

Within the inner loop, the code extracts the substring sub from index j - 1 to i (inclusive).

It checks if the anan set contains the extracted substring sub, indicating that the substring is present in the dictionary.

If the substring is found in the dictionary, it updates dip[i] to the minimum value between the current dip[i] and dip[j - 1]. This means that the current substring ending at index i can be formed using a substring ending at index j - 1 (where j - 1 is the start index of the matching word in s). Thus, it considers the optimal way to break up s.

After the loops complete execution, the method returns dip[n], which represents the minimum number of extra characters for the entire string s.
*/
        
         Set<String> anan = new HashSet<>();//A HashSet named anan is initialized to store the words from the dictionary array.
        
        for (String wordin : dictionary)
        {
            anan.add(wordin);
        }

        int n = s.length();//The length of the string s is stored in the variable n.
        //An integer array dip is created with a size of n + 1, where dip[i] represents the minimum number of extra characters for the substring ending at index i of the string s. The initial values are set such that dip[0] = 0 and dip[i] = dip[i - 1] + 1 for i from 1 to n. This means that initially, each substring of length i has i extra characters.
        
        int[] dip = new int[n + 1]; 
        
        
        for (int i = 1; i <= n; i++) 
        {
            dip[i] = dip[i - 1] + 1; 

            for (int j = i; j >= 1; j--)
            {
                String subn = s.substring(j - 1, i);

                if (anan.contains(subn)) 
                {
                    dip[i] = Math.min(dip[i], dip[j - 1]); 
                }
            }
        }

        return dip[n];
    
    }
}
