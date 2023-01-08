class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=(long)length*width*height;
        boolean Bulky=(length>=1e4||width>=1e4||height>=1e4||volume>=1e9)? true:false;
        boolean Heavy=mass>=100? true:false;
        
        if(Bulky &&Heavy) return "Both";
        if(Bulky) return "Bulky";
        if(Heavy) return "Heavy";
        return "Neither";
    }
}
