public class Palindrome {
    public static void main(String[] args) {

        String ss = "abba";

        System.out.println(isPalindrome(ss));
    }

    public static boolean isPalindrome(String s){
        char[] charArray = s.toCharArray();

        String reversedText = "";

        for (int i = charArray.length-1 ; i >= 0 ; i--) {
            reversedText = reversedText + charArray[i];
        }
        return reversedText.equals(s);
    }
}
