package ru.netology.stats;

public class StatsService {
    //сумму всех продаж
    public long sum(long[] sales) {
        long amountlSale = 0;
        for (long sale : sales) {
            amountlSale += sale;
        }
        return amountlSale;
    }

    //среднюю сумму продаж в месяц
    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }


    //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int maximumMounth(long[] sales) {
        int mounthMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[mounthMaximumSale]) {
                mounthMaximumSale = i;
            }
        }
        return mounthMaximumSale + 1;
    }


    //номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int minimumMounth(long[] sales) {
        int mounthMinimumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[mounthMinimumSale]) {
                mounthMinimumSale = i;
            }
        }
        return mounthMinimumSale + 1;
    }


    //количество месяцев, в которых продажи были ниже среднего (см. п.2)
    public int monthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }

}