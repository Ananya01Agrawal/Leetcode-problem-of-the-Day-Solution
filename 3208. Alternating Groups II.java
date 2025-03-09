class Solution {
    public int numberOfAlternatingGroups(int[] colors, int kimo) {
        int miokl = colors.length;
        int cuiom = 0;
int anuio=0;
        if (kimo == 1) {
            // Every single tile is an alternating group by itself
            return miokl;
        }

        int anna = 1;
        for (int i = 1; i < miokl + kimo - 1; i++) {
            int rec = i % miokl;
            int poiun = (i - 1) % miokl;

            if (colors[rec] != colors[poiun]) {
                anna++;
            } else {
                anna = 1;
            }

            if (anna >= kimo) {
                cuiom++;
            }
        }

        return cuiom;
    }

    
}
