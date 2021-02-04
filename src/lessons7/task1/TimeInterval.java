package lessons7.task1;

public class TimeInterval{
    private int sec;
    private int min;
    private int hour;

    public int totalSec(){
        return sec + min * 60 + hour * 3600;
    }

    public TimeInterval(int sec){
        this.hour = sec / 3600;
        this.min = sec % 3600 / 60;
        this.sec = sec % 3600 % 60;

    }

    public TimeInterval(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public TimeInterval sum(TimeInterval sec){
        return new TimeInterval(this.totalSec() + sec.totalSec());

    }
    public void print(){
        System.out.println(hour + " " + min + " " + sec);
    }


}
