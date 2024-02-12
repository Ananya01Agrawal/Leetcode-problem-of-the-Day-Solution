class Solution {
    public int majorityElement(int[] nums) {
        // we can solve this question by using the Moore's Voting Algorithm
        int majority=nums[0];// consider the first element as the majority element
        int votes=1;
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }
            else if(majority==nums[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }
}
/*
explanation of the algorithm that how its works
The intuition behind the Moore's Voting Algorithm is based on the fact that if there is a majority element in an array, it will always remain in the lead, even after encountering other elements.

Explanation:
Algorithm:

Initialize two variables: count and candidate. Set count to 0 and candidate to an arbitrary value.
Iterate through the array nums:
a. If count is 0, assign the current element as the new candidate and increment count by 1.
b. If the current element is the same as the candidate, increment count by 1.
c. If the current element is different from the candidate, decrement count by 1.
After the iteration, the candidate variable will hold the majority element.
*/
