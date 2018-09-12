/**
 * 水仙花数：一个n位正整数（n >= 3),它的每一位数字上的n次幂之和等于它本身
 */
public class NarcissusNum {
    /**
     * @param n : 位数
     */
    public static void getAllNarcissusNum(int n) {
        long start = (long) Math.pow(10, n - 1);
        long end = (long) (Math.pow(10, n) - 1);
        long i;
        int j;
        for (i = start; i <= end; i++) {
            long sum = 0;
            long temp = i;
            for (j = 0; j < n; j++) {
                sum += Math.pow(temp % 10, n);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println("找到水仙花数：" + i);
            }
        }
    }

    public static void main(String[] args) {
        getAllNarcissusNum(3);
    }
}
