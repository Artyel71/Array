import ru.netology.stats.StatsService;

import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        StatsService service = new StatsService();

        long minMonth = service.minSales((sales));
        System.out.println(minMonth);

        long maxMonth = service.maxSales((sales));
        System.out.println(maxMonth);

        long total = service.total(sales);
        System.out.println(total);

        long averagevalue = service.average(sales);
        System.out.println(averagevalue);

        long underAverage = service.underAverage(sales);
        System.out.println(underAverage);

        long overAverage = service.overAverage(sales);
        System.out.println(overAverage);
    }
}
