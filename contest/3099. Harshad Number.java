class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int xin) {
        int anan=0;
        
        int mui=xin;
        
        while(xin>0){
            anan+=xin%10;
            xin=xin/10;
        }
        if(mui%anan==0){
            return anan;
        }
        return -1;
    }
}
