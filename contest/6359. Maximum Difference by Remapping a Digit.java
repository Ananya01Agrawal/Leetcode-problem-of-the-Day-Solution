class Solution {
    public int minMaxDifference(int num) {
        String n1 = Integer.toString(num);
        String n2 = Integer.toString(num);
        char c = n1.charAt(0);
        char ch = n1.charAt(0);
        for(int i=0; i<n1.length(); i++){
            if(n1.charAt(i)!='9'){
                c = n1.charAt(i);
                break;
            }
        }
        for(int i=0; i<n1.length(); i++){
            if(n1.charAt(i)==c) n1 = n1.substring(0,i) + '9' + n1.substring(i+1);
        }
        for(int i=0; i<n1.length(); i++){
            if(n2.charAt(i)==ch) n2 = n2.substring(0,i) + '0' + n2.substring(i+1);
        }
        int mx = Integer.parseInt(n1);
        int mn = Integer.parseInt(n2);
        return mx - mn;
    }
}
