package markdown;

public class Programmer extends Amplitudo{
    private int bonus = 100;

    public static void main(String[] args) {
        Programmer alen = new Programmer();
        System.out.println(alen.bonus + alen.getSalary());
    }
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
