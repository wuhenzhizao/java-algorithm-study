/**
 * 亲密数：如果整数a的因子和等于整数b，整数b的因子和等于整数a，，因子包含1但不包含本身，且a不等于b
 */
public class FriendNum {

    public static int getFriendNum(int num) {
        int i, sum = 0;
        for (i = 1; i < num / 2 + 1; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int rage = 1000000;
        for (int i = 1; i < rage; i++){
            int fn = getFriendNum(i);
            int reverseFn = getFriendNum(fn);
            if (i == reverseFn && i < fn){
                System.out.println(i + "与" + fn + "互为亲密数");
            }
        }
    }
}
