class WordDictionary {
    
    private final TrieNode root;
    
    private class TrieNode{
        boolean endOfWord;
        TrieNode [] children = new TrieNode[26];
    }
    
    /* Initialize your data structure here. */
    public WordDictionary() {
        root = new TrieNode();
    }
    
    /* Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            TrieNode node = current.children[ch-'a'];
            if(node ==null){
                node = new TrieNode();
                current.children[ch-'a'] = node;
            }
            current  = node;
        }
        current.endOfWord = true;
    }
    
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    
    public boolean search(String word) {
        TrieNode current = root;
        return regexSearch(0,current,word.toCharArray());
    }
    
    /* Back tracking */
     private boolean regexSearch(int index, TrieNode current, char [] array){
         
         /* Base condition when we reach end of word and the EOW of flag for that TrieNode is also true*/
         if(index == array.length){
             if(current.endOfWord){
                 return true;
             }
             return false;
         }
             
         if(array[index]!='.'){
             TrieNode node = current.children[array[index]-'a']; 
             return (node!=null && regexSearch(index+1,node, array));
         }else{
             /* for char '.' we check all those characters in the children which are not null that is have furhter link/letters */
             for(int i=0;i<current.children.length;i++){
                 TrieNode node = current.children[i];
                 if(node!=null){
                     if(regexSearch(index+1,node,array)){
                         return true;
                     }
                 }
             }  
         }
         return false;
     }
}
