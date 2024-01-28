public class Solution {
    private long odd_count(int n) {
        
        return (n + 1) / 2;
    }

    private long Even_count(int n) {
        
        return n / 2;
    }

    public long flowerGame(int n, int m) {
        
        long anan = odd_count(n);
        
        long mnan = odd_count(m);

        long bnan = Even_count(n);
        
        long cnan = Even_count(m);

        // The aim of pairs whose sum is odd is the product of counts of odd and even numbers
        
        long aim = anan * cnan + bnan * mnan;

        return aim;
    }
}
