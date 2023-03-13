
package ru.netology.stats;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //public int sum(long[] sales) {
    //  int myArray[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    //int totalu = IntStream.of(myArray).sum();


    //return totalu;

    //}

    public long total(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            //for (long sale : sales) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long average(long[] sales) {
        long averagevalue = 0;
        averagevalue = total(sales) / sales.length;

        return averagevalue;
    }

    public long underAverage(long[] sales) {
        long underAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            //for (long sale : sales) {
            if (sales[i] < average(sales)) {
                // underAverage += 1;
                underAverage = underAverage + 1;
            }
        }
        return underAverage;

    }


    public long overAverage(long[] sales) {
        long overAverage = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                overAverage += 1;
            }
        }
        return overAverage;
    }

}





