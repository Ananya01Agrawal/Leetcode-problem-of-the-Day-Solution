// first approach to solve this problem

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        int left=0;
        int right=n-1;
        /*
        if(target>letters[n-1]){
            return letters[0];
        }*/
        while(left<=right){
            int mid=left+(right-left)/2;
            if(letters[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return letters[left%n];
    }
}
// binary search solution
//space complexity: O(1)

// time complexity: O(logn)



// second approach to soleve this probelm'

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(var letter: letters){
            if(letter> target)
                return letter;
        }
        return letters[0];
        
    }
}
// this is  brute force approach to solve this probelm
// time complexity: O(n)
// Space Complaxity: O(1)
