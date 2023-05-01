class Solution {
    public double average(int[] salary) {
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for (int amt : salary) {
            min = Math.min(min, amt);
            max = Math.max(max, amt);
            sum += amt;
        }
        sum = sum - max - min;
        return (sum /( salary.length -2));
    }
}
