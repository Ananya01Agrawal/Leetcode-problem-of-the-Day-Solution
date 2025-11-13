class Solution {
    public int maxOperations(String sim) {
        
        int yuitn = 0;
        
        int pim = 0;
        
        boolean oniu = false;
        
        List<Integer> buno = new ArrayList<>();

        for (char com : sim.toCharArray()) {
            if (com == '1') {
                
                buno.add(1);
                
                oniu = true;
            } 
            else if (com == '0' && oniu) {
                
                buno.add(0);
                
                oniu = false;
            }
        }

        for (int bit : buno) {
            if (bit == 1) {
                
                pim += 1;
            } 
            else {
                yuitn += pim;
            }
        }

        return yuitn;
    }
}
