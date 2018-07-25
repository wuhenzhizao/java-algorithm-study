public class Factorial {

    private long resolve(int n){
        if (n == 1){
            return 1;
        }
        return n * resolve(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        long result = factorial.resolve(20);
        System.out.println("20的阶乘是：" + result);
    }
}
