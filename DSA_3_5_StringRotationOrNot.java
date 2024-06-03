public class DSA_3_5_StringRotationOrNot {
    public static void main(String [] args){
        String s1="abcd";
        String s2="acbd";
        if (areRotation(s1, s2)) {

            System.out.println("Strings are rotations of each other");
        }
        else{
            System.out.println("Strings are not rotations of each other");
        }

    }
    public static boolean areRotation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String temp=s1+s1;
        return temp.contains(s2);
    }
}
