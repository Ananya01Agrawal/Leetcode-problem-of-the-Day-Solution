class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0, len = rolls.length;

		for(int i = 0; i < len; i++){
			sum += rolls[i];
		}
		int requiredValue = ((n + len) * mean) - sum;
        if(requiredValue < 0) return new int[0];
        
		int leastValue = requiredValue/n;
        requiredValue = requiredValue - leastValue * n;

		if(leastValue == 0 || leastValue > 6 || ( leastValue == 6 && requiredValue > 0)){
			return new int[0];
		}

		int[] result = new int[n];
		Arrays.fill(result, leastValue);
		
		for(int i = 0; i < n; i++){
			int canAccommodate = 6 - result[i];
			if(requiredValue > canAccommodate){
				result[i] = 6;
				requiredValue = requiredValue - canAccommodate;
			} else{
				result[i] += requiredValue;
				break;
			}
		}
		return result;
    }
}
