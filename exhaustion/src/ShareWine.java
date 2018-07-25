public class ShareWine {
    private int b1 = 12;
    private int b2 = 8;
    private int b3 = 5;
    private int target = 6;

    /**
     * 倒酒方法
     * 倒酒规则 b1 --> b2 --> b3 --> b1
     * b2为空时，可以从b1往2中倒酒
     *
     * @param v1 : b1 瓶子的酒量
     * @param v2 : b2 瓶子的酒量
     * @param v3 : b3 瓶子的酒量
     */
    private void backBottle(int v1, int v2, int v3) {
        System.out.println("v1: " + v1 + " -- v2: " + v2 + " -- v3: " + v3);
        if (v1 == target || v2 == target || v3 == target) {
            return;
        }
        if (v2 != 0 && v3 != b3) {
            // 瓶子2不为空, 瓶子3未倒满
            if (v2 + v3 <= b3) {
                backBottle(v1, 0, v2 + v3);
            } else {
                backBottle(v1, v2 - (b3 - v3), b3);
            }
        } else if (v3 == b3) {
            // 瓶3已满，往瓶子1倒
            if (v1 + v3 <= b1) {
                backBottle(v1 + v3, v2, 0);
            } else {
                backBottle(b1, v2, b3 - (b1 - v1));
            }
        } else {
            // 瓶2为空，
            if (v1 <= b2) {
                backBottle(0, v1, v3);
            } else {
                backBottle(v1 - b2, b2, v3);
            }
        }
    }

    public static void main(String[] args) {
        new ShareWine().backBottle(12, 0, 0);
    }
}
