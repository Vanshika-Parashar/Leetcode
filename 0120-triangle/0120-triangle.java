class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        return dfs(triangle, 0, 0);
    }

    private int dfs(List<List<Integer>> triangle, int row, int col) {
        // Base case: last row
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        // Recursive case: explore both paths
        int down = dfs(triangle, row + 1, col);
        int diagonal = dfs(triangle, row + 1, col + 1);

        return triangle.get(row).get(col) + Math.min(down, diagonal);
    }
}
