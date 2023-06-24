class Solution {
    public int longestString(int x, int y, int z) {
        int anan=z*2;
        // putting the condition
        // if x is grater than y
        if(x>y){
            anan+=2*y+(y+1)*2;
            
        }
        // if y is grater than x
        
        else if(y>x){
            anan+=2*x+(x+1)*2;
            
        }
        
        else{
            anan+=4*x;
        }
        
        return anan;
    }
}
