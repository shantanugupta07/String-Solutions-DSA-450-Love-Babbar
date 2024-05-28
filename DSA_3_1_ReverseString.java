class ReverseString{
    public void reverseString(char []s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
}
public class DSA_3_1_ReverseString {
    public static void main(String [] args){
        char []c= {'h', 'e','l', 'l', 'o'};
        System.out.println(c);
        ReverseString r= new ReverseString();
        r.reverseString(c);
        System.out.println(c);
    }
}

