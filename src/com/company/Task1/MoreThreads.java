package com.company.Task1;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("The main thread starts running.");

        MyThreads myThread1 = MyThreads.createAndStart("Child thread # 1");
        MyThreads myThread2 = MyThreads.createAndStart("Child thread # 2");
        MyThreads myThread3 = MyThreads.createAndStart("Child thread # 3");


        try{
            myThread1.thread.join();
            myThread2.thread.join();
            myThread3.thread.join();

        }catch (InterruptedException x) {
                System.out.println("The main thread has been terminated");
        }

        System.out.println("The main thread is exiting");
    }
}
