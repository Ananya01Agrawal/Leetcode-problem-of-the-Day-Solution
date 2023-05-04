class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> list1 = new LinkedList<>();
        Queue<Integer> list2 = new LinkedList<>();
        int n = senate.length();
        for(int i = 0;i < n;i++){
            if(senate.charAt(i) == 'R') list1.add(i);
            else list2.add(i);
        }
        for(;!list1.isEmpty() && !list2.isEmpty();){
            int r = list1.poll();
            int d = list2.poll();
            if(r < d) list1.add(r + n);
            else list2.add(d + n);
        }
        return list1.size() > list2.size() ? "Radiant" : "Dire";
    }
}
