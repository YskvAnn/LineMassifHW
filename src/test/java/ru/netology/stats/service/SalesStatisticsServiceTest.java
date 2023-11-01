package ru.netology.stats.service;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SalesStatisticsServiceTest {

    @Test

    public void shouldFindSumSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMidSales() {

        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.midSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldFindMinSalesMonth() {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.monthMinSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void shouldFindMonthWithMinSales() {

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthsWithMaxSales(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMonthWithMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.monthsWithMaxSales(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }
}



