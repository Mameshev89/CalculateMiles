public class Main {
    public static void main(String[] args) {
        BonusMilesService run = new BonusMilesService();
        int price = 10;
        int miles = run.calculate(price);
        System.out.println(miles);
    }
}
