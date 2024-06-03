public class DSA_3_6_ValidShuffle {
    public static boolean isValid(String str1, String str2, String result){
        int n1= str1.length();
        int n2= str2.length();
        int n= result.length();

        if(n1 + n2 !=n){
            return false;
        }
        int i=0; int j=0; int k=0;
        while(k<n){
            if(i<n1 && str1.charAt(i)==result.charAt(k)){
                i++;
            }
            else if(j<n2 && str2.charAt(j)==result.charAt(k)){
                j++;
            }
            else{
                return false;
            }
            k++;
        }
        return i==n1 && j==n2;
    }
    public static void main(String [] args){
        String str1 = "abc";
        String str2 = "def";
        String result = "adbcef";

        if (isValid(str1, str2, result)) {
            System.out.println("The string is a valid shuffle of the two strings.");
        } else {
            System.out.println("The string is not a valid shuffle of the two strings.");
        }
    }
}
