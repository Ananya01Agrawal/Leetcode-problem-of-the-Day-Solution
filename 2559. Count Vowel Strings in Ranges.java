class Solution {
    HashSet<Character> set = new HashSet();
    public int[] vowelStrings(String[] words, int[][] queries) {
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        int[] pre = new int[words.length];
        int tot = 0;
        int i = 0;
        for(String s: words) {
            if (set.contains(s.charAt(0)) && set.contains(s.charAt(s.length()-1))) tot++;
            pre[i] = tot;
            i++;
        }
        int[] a = new int[queries.length];
        i = 0;
        for(int[] q: queries) {
            int p = q[0] == 0 ? 0 : pre[q[0]-1];
            a[i] = pre[q[1]] - p;
            i++;
        }
        return a;
    }

}
