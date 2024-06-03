class SubsequenceString{
    public void printAllSubsequences(String str){
        generateSequences(str, 0, "");
    }
    private void generateSequences(String str, int index, String current){
        int n=str.length();
        if(index==n){
            System.out.println(current);
            return;
        }
        generateSequences(str, index+1, current+str.charAt(index));
        generateSequences(str, index+1, current);
    }
}
public class DSA_3_10_PrintAllSubsequencesString {
    public static void main(String [] args){
        String str= "abc";
        SubsequenceString s= new SubsequenceString();
        s.printAllSubsequences(str);
    }
}
