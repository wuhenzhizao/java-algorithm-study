/**
 * 完全数：所有真因子的和等于其本身的自然数
 */
public class PerfectNum {

    public static long getPerfectNum(int range) {
        long[] p = new long[300];
        long i, j, sum, num;
        int k, count;
        for (i = 1; i < range; i++) {
            count = 0;
            num = i;
            sum = num;
            for (j = 1; j < num; j++) {
                if (num % j == 0) {
                    p[count++] = j;
                    sum -= j;
                }
            }
            if (sum == 0) {
                // 找到完全数
                System.out.printf("%4d是一个完全数，因子是", num);
                System.out.printf("%d=%d", num, p[0]);
                for (k = 1; k < count; k++) {
                    System.out.printf("+%d", p[k]);
                }
                System.out.println();
            }
        }
        return 0;
    }

    public static void main(String[] args){
        getPerfectNum(100000);
    }
}
