public class LeetCode {
    private class Solution {
        public int secondHighest(String s) {
            int max = 0;
            int max2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 1 && s.charAt(i) <= 9) {
                    if (s.charAt(i) > max) {
                        max2 = max;
                        max = s.charAt(i);
                    } else if (s.charAt(i) > max2) {
                        max2 = s.charAt(i);
                    }
                }
            }
            if(max==max2)
                return -1;
            return max2;
        }

        public static void main(String[] args) {
            Solution solution = new LeetCode().new Solution();
            solution.secondHighest("114514");
        }
    }
}
