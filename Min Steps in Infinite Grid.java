public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        int currentA = A.get(0);
        int currentB = B.get(0);
        int coverPoints = 0;
        for(int i =1; i < size; i++){
            int a = A.get(i);
            int b = B.get(i);
            coverPoints += Math.max(Math.abs(currentA - a), Math.abs(currentB - b));
            currentA = a;
            currentB = b;
        }
        return coverPoints;
    }
}
