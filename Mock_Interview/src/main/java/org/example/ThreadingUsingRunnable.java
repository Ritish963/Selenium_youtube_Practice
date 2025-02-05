package org.example;

class Threading1 implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
}
class Threading2 implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread());
    }
}
public class ThreadingUsingRunnable
{
    public static void main(String[] args) {

        Threading1 t1= new Threading1();
        Threading2 t2= new Threading2();
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        th1.start();
        th2.start();
    }
}