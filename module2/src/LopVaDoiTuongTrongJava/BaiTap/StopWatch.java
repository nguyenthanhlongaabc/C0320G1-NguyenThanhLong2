package LopVaDoiTuongTrongJava.BaiTap;

import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = new Date().getTime();
    }

    public void start() {
        this.startTime = new Date().getTime();
    }

    public void stop() {
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.getElapsedTime();
        stopWatch.start();
        stopWatch.stop();

    }
    
        
    }

