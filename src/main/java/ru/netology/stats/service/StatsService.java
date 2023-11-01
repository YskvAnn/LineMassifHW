package ru.netology.stats.service;

public class StatsService {

    public long sumSales(long[] sales) {
        long allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }
        return allSales;
    }


    public long midSales(long[] sales) {
        long allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales += sales[i];
        }
        long midSales = allSales / 12;
        return midSales;


    }

    public int maxSales(long[] sales) {
        int dayMaxSales = 0;


        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[dayMaxSales]) {
                dayMaxSales = i;
            }
        }
        return dayMaxSales + 1;
    }

    public int monthMinSales(int[] sales) {

        int monthMinSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinSales]) {
                monthMinSales = i;
            }
        }
        return monthMinSales + 1;
    }

    public int monthsWithMaxSales(long[] sales) {
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < midSales(sales)) {
                count++;
            }
        }
        return count;
    }


    public int monthsWithMinSales(long[] sales) {
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > midSales(sales)) {
                count++;
            }
        }
        return count;
    }
}























