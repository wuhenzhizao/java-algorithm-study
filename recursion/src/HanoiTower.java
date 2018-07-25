public class HanoiTower {
    /**
     * @param num    : 数量
     * @param from   : 开始塔
     * @param assist : 辅助塔
     * @param to     : 目标塔
     */
    private void resolve(int num, char from, char assist, char to) {
        if (num == 0) {
            return;
        }
        resolve(num - 1, from, to, assist);
        move(from, to);
        resolve(num - 1, assist, from, to);
    }

    private void move(char from, char to) {
        System.out.println("从 " + from + " 移动到 " + to);
    }

    public static void main(String[] args) {
        HanoiTower tower = new HanoiTower();
        tower.resolve(5, 'A', 'B', 'C');
        System.out.println("移动完成");
    }
}
