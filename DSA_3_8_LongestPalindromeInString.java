class LongestPalindromeString{
    private static int expandAroundCenter(String S, int left, int right){
        while(left>=0 && right<S.length() && S.charAt(left)==S.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    static String longestPalin(String S){
        if(S==null || S.length()<1){
            return "";
        }
        int start= 0;
        int end=0;
        for(int i=0; i<S.length(); i++){
            int len1= expandAroundCenter(S, i, i);
            int len2=expandAroundCenter(S, i, i+1);
            int len=Math.max(len1, len2);
            if(len>end - start+1){
                start=i-(len-1)/2;
                end =i+len/2;
            }
        }
        return S.substring(start, end+1);
    }
}
public class DSA_3_8_LongestPalindromeInString {
    public static void main(String [] args){
        LongestPalindromeString sol = new LongestPalindromeString();
        System.out.println(sol.longestPalin("aaaabbaa")); // Output: "aabbaa"
        System.out.println(sol.longestPalin("rfkqyuqfjkxy")); // Output: "r"
        System.out.println(sol.longestPalin("babad")); // Output: "bab" or "aba"
        System.out.println(sol.longestPalin("cbbd")); // Output: "bb"
    }
}
