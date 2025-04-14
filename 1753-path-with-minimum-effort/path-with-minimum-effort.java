class Solution {
    static class Cell {
        int row, col, effort;

        Cell(int row, int col, int effort) {
            this.row = row;
            this.col = col;
            this.effort = effort;
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        int[][] efforts = new int[rows][cols];
        for (int[] row : efforts) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.effort));
        pq.offer(new Cell(0, 0, 0));
        efforts[0][0] = 0;
        while (!pq.isEmpty()) {
            Cell current = pq.poll();
            int r = current.row, c = current.col, effort = current.effort;
            if (r == rows - 1 && c == cols - 1)
                return effort;
            for (int[] dir : directions) {
                int nr = r + dir[0], nc = c + dir[1];
                if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {
                    int newEffort = Math.max(effort, Math.abs(heights[r][c] - heights[nr][nc]));
                    if (newEffort < efforts[nr][nc]) {
                        efforts[nr][nc] = newEffort;
                        pq.offer(new Cell(nr, nc, newEffort));
                    }
                }
            }
        }
        return -1;
    }
}
