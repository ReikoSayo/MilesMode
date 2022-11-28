public class BonusMilesService {
    public int calculate(int cost) {
        int mile;
        int unit = 20;
        if (cost >= 20) {
            mile = cost / unit;
            return mile;
        } else {
            return 0;
        }
    }
}
