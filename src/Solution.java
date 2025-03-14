import java.util.*;

class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x1 = points[i][0];
                    int y1 = points[i][1];
                    int x2 = points[j][0];
                    int y2 = points[j][1];
                    int x3 = points[k][0];
                    int y3 = points[k][1];

                    double area = (double) Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2;
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestTriangleArea(new int[][]{new int[]{5,5},new int[]{0,1},new int[]{1,0}, new int[]{0,2}, new int[]{2,0}}));
    }
}









