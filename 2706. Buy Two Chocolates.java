class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=0;
        Arrays.sort(prices);
        int t=prices[0]+prices[1];
        if(money>=t){
            return money-t;
        }
        else{
            return money;
        }
        
    }
}
