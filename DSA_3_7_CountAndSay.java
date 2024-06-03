class CountAndSay{
    private String RLE(String s){
        StringBuilder sb= new StringBuilder();
        int combo=0;
        int curr=0;
        for(int i=0; i<s.length(); i++){
            if(combo==0){
                ++combo;
                curr=s.charAt(i);
            }
            else{
                if(curr== s.charAt(i)){
                    ++combo;
                }
                else{
                    sb.append(combo);
                    sb.append(curr);
                    combo=1;
                    curr= s.charAt(i);
                }
            }

        }
        sb.append(combo);
        sb.append(curr);
        return sb.toString();
    }
    public String countAndsay(int n){
        if(n==1){
            return "1";
        }
        return RLE(countAndsay(n-1));
    }
}
public class DSA_3_7_CountAndSay {
    public static void main(String []args){
        int n=5;
        CountAndSay c= new CountAndSay();
        System.out.println(c.countAndsay(n));
    }
}
