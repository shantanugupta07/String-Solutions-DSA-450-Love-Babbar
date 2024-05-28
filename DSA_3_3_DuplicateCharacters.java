import java.util.HashMap;
import java.util.Map;

class DuplicateCharacterString{
    public static void printDuplicateCharacters(String s){
        HashMap<Character, Integer> charCountMap= new HashMap<>();
        for(char ch: s.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+", count="+entry.getValue());
            }
        }
    }
}
public class DSA_3_3_DuplicateCharacters {
    public static void main(String [] args){
        String s= "geekforgeeks";
        DuplicateCharacterString.printDuplicateCharacters(s);
    }
}
