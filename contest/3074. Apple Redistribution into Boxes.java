import java.util.Arrays;

class Solution {
    public int minimumBoxes(int[] arr1, int[] arr2) {
        int nim1 = arr1.length;
        int nim2 = arr2.length;
        int reply = 0;
        int cim1 = 0;
        int add = 0;
        
        Arrays.sort(arr2);
        reverseArray(arr2);
        
        for (int i = 0; i < nim1; i++) {
            reply += arr1[i];
        }
        
        for (int i = 0; i < nim2; i++) {
            add += arr2[i];
            cim1++;
            if (add >= reply)
                break;
        }
        
        return cim1;
    }
    
    private void reverseArray(int[] arr) {
        int beg = 0;
        int uny = arr.length - 1;
        while (beg < uny) {
            int pemi = arr[beg];
            arr[beg] = arr[uny];
            arr[uny] = pemi;
            beg++;
            uny--;
        }
    }
}
