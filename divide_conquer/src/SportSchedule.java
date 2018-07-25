public class SportSchedule {
    /**
     * @param table 1  2  3  4  5  6  7  8
     *              2  1  4  3  6  5  8  7
     *              3  4  1  2  7  8  5  6
     *              4  3  2  1  8  7  6  5
     *              5  6  7  8  1  2  3  4
     *              6  5  8  7  2  1  4  3
     *              7  8  5  6  3  4  1  2
     *              8  7  6  5  4  3  2  1
     */
    public int[][] scheduleTable(int[][] table, int n) {
        if (n == 1) {
            table[0][0] = 1;
        } else {
            int half = n / 2;
            // 填充左上矩阵
            scheduleTable(table, half);
            // 填充右上矩阵
            for (int i = 0; i < half; i++) {
                for (int j = half; j < n; j++) {
                    table[i][j] = table[i][j - half] + half;
                }
            }
            // 填充右下区域
            for (int i = half; i < n; i++) {
                for (int j = 0; j < half; j++) {
                    table[i][j] = table[i - half][j] + half;
                }
            }
            // 填充右下区域
            for (int i = half; i < n; i++) {
                for (int j = half; j < n; j++) {
                    table[i][j] = table[i - half][j - half];
                }
            }
        }
        return table;
    }

    public static void main(String[] args) {
        SportSchedule schedule = new SportSchedule();
        int n = 8;
        int[][] table = new int[n][n];
        table = schedule.scheduleTable(table, n);
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                builder.append(j > 0 ? "  " + table[i][j] : table[i][j]);
            }
            System.out.println(builder.toString());
        }
    }
}
