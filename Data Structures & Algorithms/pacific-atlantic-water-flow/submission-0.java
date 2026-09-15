class Solution {

    int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public void bfs(int[][] heights, boolean[][] vis, Queue<int[]> q) {

        int m = heights.length;
        int n = heights[0].length;

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for (int[] d : dir) {

                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nr >= m || nc < 0 || nc >= n)
                    continue;

                if (vis[nr][nc])
                    continue;

                if (heights[nr][nc] < heights[r][c])
                    continue;

                vis[nr][nc] = true;
                q.add(new int[]{nr, nc});
            }
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        Queue<int[]> pq = new LinkedList<>();
        Queue<int[]> aq = new LinkedList<>();

        // Pacific: Top + Left
        for (int i = 0; i < m; i++) {
            pacific[i][0] = true;
            pq.add(new int[]{i, 0});
        }

        for (int j = 0; j < n; j++) {
            if (!pacific[0][j]) {
                pacific[0][j] = true;
                pq.add(new int[]{0, j});
            }
        }

        // Atlantic: Bottom + Right
        for (int i = 0; i < m; i++) {
            atlantic[i][n - 1] = true;
            aq.add(new int[]{i, n - 1});
        }

        for (int j = 0; j < n; j++) {
            if (!atlantic[m - 1][j]) {
                atlantic[m - 1][j] = true;
                aq.add(new int[]{m - 1, j});
            }
        }

        bfs(heights, pacific, pq);
        bfs(heights, atlantic, aq);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }
}