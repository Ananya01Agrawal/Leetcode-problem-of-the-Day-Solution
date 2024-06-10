class Solution {
    public int heightChecker(int[] heights) {
    int n = heights.length;
    int backup[] = new int[n]; // make a copy of the entire array by going through each element 
    for (int i = 0; i < n; i++)
        backup[i] = heights[i];
    Arrays.sort(heights); //sort the original array
    
    int count = 0;
    for(int i = 0; i < n; i++){ 
        if(heights[i] != backup[i]) //because the 2 array have the same length loop through one array and checking on both values, if not equal increase the count
            count++;
    }
    return count;
}
}
