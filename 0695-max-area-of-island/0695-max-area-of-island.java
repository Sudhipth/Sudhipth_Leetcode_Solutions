class Solution {
    public class Pair {
        int row;
        int col;
        Pair(int r, int c) {
            row = r;
            col = c;
        }
    }

    public int bfs(int i, int j, int[][] grid, int[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        vis[i][j] = 1;
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        int area = 1; 
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for (int k = 0; k < 4; k++) {
                int nrow = r + drow[k];
                int ncol = c + dcol[k];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1) {
                    q.add(new Pair(nrow, ncol));
                    vis[nrow][ncol] = 1;
                    area++; 
                }
            }
        }
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && vis[i][j] == 0) {
                    int area = bfs(i, j, grid, vis);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}