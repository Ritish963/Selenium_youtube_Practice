package org.example;

public class Threading extends Thread {
    @Override
    public void run()
    {
        for(int i=0;i<=2;i++)
        {
            System.out.println("thread implicit"+Thread.currentThread());
        }
    }
    public static void main(String[] args) {
        Threading t1 =new Threading();
        t1.run();
        System.out.println(Thread.currentThread());
        for(int i=0;i<=2;i++)
            {
                System.out.println("main thread");
            }

    }

}
