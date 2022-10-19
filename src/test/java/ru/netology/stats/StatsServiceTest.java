package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    public void shouldSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

        @Test
        public void shouldBelowAverage(){
            long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            StatsService service = new StatsService();

            int actual = service.belowAverage(sales);
            long expected = 5;
            Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldAboveAverage(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.belowAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldAverage(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.average(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void shouldMinMonth(){
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void shouldMaxMonth() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int actual = service.maxSales(sales);
        long expected = 6;
        Assertions.assertEquals(expected, actual);
    }



    }

