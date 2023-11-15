package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {7, 15, 13, 15, 23, 20, 19, 21, 8, 11, 17, 23};

        long actual = service.sum(sales);
        long expected = 192;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        StatsService service = new StatsService();
        long[] sales = {7, 15, 13, 15, 23, 20, 19, 21, 8, 11, 17, 23};

        long actual = service.average(sales);
        long expected = 16;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMaximum() {
        StatsService service = new StatsService();
        long[] sales = {7, 15, 13, 15, 23, 20, 19, 21, 8, 11, 17, 23};

        long actual = service.maximumMounth(sales);
        long expected = 12;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testMinimum() {
        StatsService service = new StatsService();
        long[] sales = {7, 15, 13, 15, 23, 20, 19, 21, 8, 11, 17, 23};

        long actual = service.minimumMounth(sales);
        long expected = 1;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {7, 15, 13, 15, 23, 20, 19, 21, 8, 11, 17, 23};

        long actual = service.monthBellowAverage(sales);
        long expected = 6;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {7, 15, 13, 15, 23, 20, 19, 21, 8, 11, 17, 23};

        long actual = service.monthAboveAverage(sales);
        long expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}