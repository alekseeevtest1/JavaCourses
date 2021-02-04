package lessons7.task1;

public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 2, 1);

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSec());

        TimeInterval sumInterval = timeInterval.sum(timeInterval1);

        sumInterval.print();


    }
}
