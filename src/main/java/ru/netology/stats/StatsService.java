package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int average = calculateSum(sales);
        return average / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxSale = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxSale]) {
                maxSale = month;
            }
            month = month + 1;
        }
        return maxSale + 1;
    }

    public int minSales(int[] sales) {
        int minSale = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minSale]) {
                minSale = month;
            }
            month = month + 1;
        }
        return minSale + 1;
    }

    public int minAverageSales(int[] sales) {
        int averageSales = calculateAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < averageSales) {
                month = month + 1;
            }
        }
        return month;
    }

    public int maxAverageSales(int[] sales) {
        int averageSales = calculateAverage(sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > averageSales) {
                month = month + 1;
            }
        }
        return month;
    }
}