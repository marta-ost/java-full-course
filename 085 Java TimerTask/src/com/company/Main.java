package com.company;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {

        // Timer =     a facility for threads to schedule tasks
        //             for future execution in a background thread

        // TimerTask = a task that can be scheduled for one-time
        //             or repeated execution by a Timer

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("Happy new year!");
                    timer.cancel();
                }
                //System.out.println("Task is completed");
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2022);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        date.set(Calendar.DAY_OF_MONTH, 31);
        date.set(Calendar.HOUR_OF_DAY, 23);
        date.set(Calendar.MINUTE, 59);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);

        //timer.schedule(task, 3000); //3000 milliseconds = 3 seconds
        //timer.schedule(task, date.getTime()); //after we run this - this will complete at this time that we set
        timer.scheduleAtFixedRate(task, 0, 1000); //will repeat every 1 second
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
    }
}
