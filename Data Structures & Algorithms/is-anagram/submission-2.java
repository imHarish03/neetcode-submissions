class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() !=t.length()){
            return false;
        }

        char[] sArray=s.toCharArray();   
        Map<Character,Integer>count =new HashMap<>();    
        
        for (char c : sArray) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }    


         char[] tArray=t.toCharArray();
         Map<Character,Integer>countT =new HashMap<>();        
        for (char c : tArray) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }         

        if(count.equals(countT)){
            return true;
        }else{
            return false;
        }


    }
}
