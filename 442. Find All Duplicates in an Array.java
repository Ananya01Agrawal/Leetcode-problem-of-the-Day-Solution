class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        // Approach
    // Sort the array
    // iterate through the array for i =1 and everytime the array's element is equal tot he element before it, add to the list we have to return
    ArrayList<Integer> result=new ArrayList<>();
    Arrays.sort(arr);
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            result.add(arr[i]);
        }
    }
    return result;
    }
}

// time complexity: O(nlogn)

