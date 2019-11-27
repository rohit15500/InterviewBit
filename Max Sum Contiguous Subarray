public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
            int globalMax = A.get(0);
            int currentMax = A.get(0);
            for (int i = 1; i < A.size(); i++) {
                currentMax = Math.max(A.get(i), currentMax + A.get(i));
                globalMax = Math.max(currentMax, globalMax);
            }
            return globalMax;
    }
}
