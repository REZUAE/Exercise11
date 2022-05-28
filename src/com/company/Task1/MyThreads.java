package com.company.Task1;

public class MyThreads implements Runnable{
    Thread thread;
    MyThreads(String name){
        thread = new Thread(this,name);
    }
    public static MyThreads createAndStart(String name){
        MyThreads myThreads = new MyThreads(name);
        myThreads.thread.start();
        return myThreads;
    }

    public void run(){
        System.out.println(thread.getName()+" starts to operate");
        try{
            for (int i = 0; i<10;i++){
                Thread.sleep(100);
                System.out.println(thread.getName()+" is executed, the counter value: "+i);
            }
        } catch(InterruptedException x){
            System.out.println(thread.getName()+ "has been interrupted");
        }
        System.out.println(thread.getName()+" finishes running.");
    }
}
