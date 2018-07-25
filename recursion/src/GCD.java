public class GCD {
    /**
     * @param x
     * @param y
     */
    private int gcd(int x, int y) {
        if (y > x) {
            int temp = y;
            y = x;
            x = temp;
        }
        if (x % y == 0) {
            return y;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int result = gcd.gcd(24, 36);
        System.out.println("最小公约数是：" + result);
    }
}
