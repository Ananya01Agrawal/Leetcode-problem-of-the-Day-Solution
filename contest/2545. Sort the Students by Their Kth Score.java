class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        sort(score, k);
        return score;
    }
    
    public void sort(int score[][], int k){
        Arrays.sort(score, new Comparator<int[]>() {           
          public int compare(int[] e1, int[] e2) {
            if (e1[k] >= e2[k]) return -1;
            else return 1;
          }
        });
    }
}
