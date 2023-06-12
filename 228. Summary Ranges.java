class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();

        if (nums.length == 0) {
            return ranges;
        }
        
        int start = 0;
        int end = 1;

        while (end < nums.length) {
            if (nums[end] - nums[start] != end - start) {
                if (start == end - 1) {
                    ranges.add(Objects.toString(nums[start]));
                } else {
                    ranges.add(nums[start] + "->" + nums[end - 1]);
                }
                start = end;
            }
            
            end++;
        }

        if (start == end - 1) {
            ranges.add(Objects.toString(nums[start]));
        } else {
            ranges.add(nums[start] + "->" + nums[end - 1]);
        }

        return ranges;
        }
}
