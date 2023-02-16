
package ru.netology.stats;
public class StatsService {


    public long sumOfAllSales(long[] arr) {
        long sum = 0;
        for (long ar : arr) {
            sum += ar;
        }
        return sum;
    }

    public long averageSumOfSalesMonth(long[] arr) {
        return sumOfAllSales(arr) / arr.length;
    }

    public int monthWithMaxSales(long[] arr) {
        int month = 0;
        long saleMax = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= saleMax) {
                month = i;
                saleMax = arr[i];
            }
        }
        return month + 1;
    }

    public int monthWithMinSales(long[] arr) {
        int month = 0;
        long saleMin = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= saleMin) {
                month = i;
                saleMin = arr[i];
            }
        }
        return month + 1;
    }

    public int monthsWithMiddleLowSales(long[] arr) {
        int middleLowMonth = 0;
        for (long l : arr) {
            if (l < averageSumOfSalesMonth(arr)) {
                middleLowMonth++;
            }
        }
        return middleLowMonth;
    }

    public int monthsWithMiddleMaxSales(long[] arr) {
        int middleMaxMonth = 0;
        for (long l : arr) {
            if (l > averageSumOfSalesMonth(arr)) {
                middleMaxMonth++;
            }
        }
        return middleMaxMonth;
    }

}
