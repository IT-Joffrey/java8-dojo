package util;

/**
 * Timer util.
 * Created by joffrey on 01/05/2018.
 */
public class Timer {

    private String name;

    private long startTime;

    private long endTime;

    private long elapsedTime;

    public Timer(final String name) {
        this.name = name;
    }

    public void start() {
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.endTime = System.nanoTime();
        this.elapsedTime = (this.endTime - this.startTime) / 1000000;
    }

    public void stopAndPrint() {
        this.stop();
        System.out.println(this.name + " : " + this.elapsedTime);
    }


}
