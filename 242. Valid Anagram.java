class Solution {
    public boolean isAnagram(String s, String t) {
        // this is the solution which is olved using the arrays
        // But we can also solved using hashmap
        if(s.length()!=t.length()) return false;
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}
