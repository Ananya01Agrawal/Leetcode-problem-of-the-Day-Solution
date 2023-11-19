class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int cnut;
int cn1 = s1.length(), cn2 = s2.length(), cn3 = s3.length();

int i = 0;
while (i < Math.min(Math.min(cn1, cn2), cn3) && s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
    i++;
}

cnut = cn1 + cn2 + cn3 - 3 * i;

if (i == 0) {
    return -1;
}

return cnut;
    }
}
