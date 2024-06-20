import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test

    public void testshouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testshouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testshouldCalculateForNotRegisteredUnderLimit() {
        BonusService service = new BonusService();

        long amount = 2000;
        boolean registered = false;
        long expected = 20;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testshouldCalculateForNotRegisteredOverLimit() {
        BonusService service = new BonusService();

        long amount = 2_000_000;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
}


