package three;

public class CheckPalindrome {
    public static String isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return s+"不是回文串";
            }
            left++;
            right--;
        }
        return s+"是回文串";
    }
}
