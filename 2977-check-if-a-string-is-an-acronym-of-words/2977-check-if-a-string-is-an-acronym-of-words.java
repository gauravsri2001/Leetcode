class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean checker = false;
        if(s.length() == words.size())
        for(int i = 0; i < words.size(); i++){
            
            if(words.get(i).charAt(0) == s.charAt(i)){
                checker = true;
            }else{
                checker = false;
            }

            if(checker == false){
                return false;
            }
        }

        return checker;
    }
}