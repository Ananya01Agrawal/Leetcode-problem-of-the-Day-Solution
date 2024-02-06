class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>hm=new HashMap<>();
        for(String s:strs){
            char temp[]=s.toCharArray();
            Arrays.sort(temp);
            String Key=String.valueOf(temp);

            if(hm.containsKey(Key)){
                hm.get(Key).add(s);
            }
            else{
                hm.put(Key,new ArrayList(Arrays.asList(new String[]{s})));
            }
        }
        List<List<String>> result=new ArrayList<>();
        for(String Key:hm.keySet()){
            result.add(hm.get(Key));
        }
        return result;

    }
}
