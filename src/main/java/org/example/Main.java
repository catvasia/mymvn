public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate( 1000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = service.calculate(5_000, true);
        System.out.println("2. " + expected + " == ? == " + actual);


    }
}
