class Solution {
    public int countSeniors(String[] details) { 
        int count=0;// initialise the count to zero
        
        for(int i=0;i<details.length;i++){// traverse through the array
            
            String str=details[i];// convert the string to character
            
            int age=Integer.parseInt(str.substring(11,13));// checking condition within the given string
            
            if(age>60){// if age greater than 60
                
                count++;// increase the count by 1
            }
        }
        return count;// return the count
    }
}
