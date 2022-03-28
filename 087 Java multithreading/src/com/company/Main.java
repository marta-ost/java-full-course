package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // multithreading = process of executing multiple threads simultaneously
        //                  helps maximum utilization of CPU
        //                  threads are independent, they don't affect the execution of other threads
        //                  an exception in one thread will not interrupt other threads
        //                  useful for serving multiple clients, multiplayer games or other mutually independent tasks

        //MyThread thread1 = new MyThread();
        //MyThread thread2 = new MyThread(); //first way

        //MyRunnable runnable1 = new MyRunnable();
        //Thread thread1 = new Thread(runnable1);
        //MyRunnable runnable2 = new MyRunnable();
        //Thread thread2 = new Thread(runnable2); //other way

        // other way of creating a thread: use a subclass or a class that's implementing the Runnable interface,
        // create an instance of it, and then pass it as an argument to the Thread class
        // (first way: create a subclass of the Thread class). Using Runnable we can still use
        // inheritance, so it can extend another class

        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //thread1.start();
        //thread1.join();  // pauses our main thread until the thread1 is completely done
                           // and then it's going to continue on with the rest of the program
        //thread2.start(); // also waits because main thread waits

        //thread1.start();
        //thread1.join(3000); //the main thread is going to be paused for 3 seconds
        //thread2.start();

        //calling thread (ex. main) waits until the specified thread dies or for x milliseconds

        //System.out.println(1/0); //exception - even if this thread stopped, another threads still continued

        thread1.setDaemon(true);
        thread1.setDaemon(true);

        thread1.start();
        thread2.start();

        System.out.println(1 / 0); //exception - stopped all other threads, because they are daemon
    }
}
