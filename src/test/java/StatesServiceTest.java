import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatesServiceTest {

    @Test
    public void testSum() {
        StatsService statsService = new StatsService();
        long[] Array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.sumOfAllSales(Array);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testAverageSum() {
        StatsService statsService = new StatsService();
        long[] Array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.averageSumOfSalesMonth(Array);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMonthMaxSale() {
        StatsService statsService = new StatsService();
        long[] Array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.monthWithMaxSales(Array);
        long expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMonthMinSale() {
        StatsService statsService = new StatsService();
        long[] Array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.monthWithMinSales(Array);
        long expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMonthMiddleLowSales() {
        StatsService statsService = new StatsService();
        long[] Array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.monthsWithMiddleLowSales(Array);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMonthMiddleMaxSales() {
        StatsService statsService = new StatsService();
        long[] Array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = statsService.monthsWithMiddleMaxSales(Array);
        long expected = 5;

        Assertions.assertEquals(actual, expected);
    }

}
