public class BonusMilesService {
    public int calculate(int cost) {
        int bonusUnit = 20;
        int bonusMiles = cost / bonusUnit;
        return bonusMiles;
    }
}
