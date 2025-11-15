// ...existing code...
public class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes.
        if (x < 0) return false;
        // Numbers ending with 0 (but not 0 itself) are not palindromes.
        if (x % 10 == 0 && x != 0) return false;

        int revertedHalf = 0;
        while (x > revertedHalf) {
            revertedHalf = revertedHalf * 10 + x % 10;
            x /= 10;
        }

        // For even length numbers x == revertedHalf.
        // For odd length numbers x == revertedHalf/10 (middle digit ignored).
        return x == revertedHalf || x == revertedHalf / 10;
    }

    // Quick test runner
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] tests = {121, -121, 10, 12321, 0};
        for (int t : tests) {
            System.out.println(t + " -> " + sol.isPalindrome(t));
        }
    }
}
// ...existing code...