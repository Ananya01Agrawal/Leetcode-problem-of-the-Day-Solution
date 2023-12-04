class Solution {
    public static String largestGoodInteger(String num) {
        String dict[] = new String[] {"999","888","777","666","555","444","333","222","111","000"};
        for(String s:dict) {
            if(num.indexOf(s)>-1)
                return s;
        }
        return "";
    }
}
