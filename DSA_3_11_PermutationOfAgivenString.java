import java.util.*;

class PermutationString{
    public List<String> find_permutation(String s){
        List<String> result = new ArrayList<>();
        char [] chars= s.toCharArray();
        Arrays.sort(chars);
        boolean [] visited= new boolean[s.length()];
        backtrack(chars, visited, new StringBuilder(), result);
        return result;
    }
    private void backtrack(char [] chars, boolean [] visited, StringBuilder current, List<String> result){
        if(current.length()==chars.length){
            result.add(current.toString());
            return;
        }
        for(int i=0; i<chars.length; i++){
            if(visited[i]||(i>0 && chars[i]==chars[i-1] && !visited[i-1])){
                continue;
            }
            visited[i]=true;
            current.append(chars[i]);
            backtrack(chars, visited, current, result);
            current.deleteCharAt(current.length()-1);
            visited[i]=false;
        }
    }
}
public class DSA_3_11_PermutationOfAgivenString {
    public static void main(String [] args){
        PermutationString p= new PermutationString();
        String s= "ABC";
        List<String> permutations = p.find_permutation(s);

        // Print the permutations
        for(String perm : permutations){
            System.out.println(perm);
        }

    }
}
