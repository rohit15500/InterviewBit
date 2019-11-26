public class Solution {
    public int isPalindrome(String A) {
        A = A.toLowerCase();
        A = A.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
       if(A.equals(sb.toString())) return 1;
       return 0;
    }
}
