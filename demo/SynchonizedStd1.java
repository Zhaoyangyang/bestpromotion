/**
 * 欢迎关注微信公众账号：码农搬砖
 * 考点：Synchonized 类锁和对象锁
 * 问题：对同一个对象，同时访问静态Synchonized和非静态Synchonized方法，两个线程可以并发访问，还是顺序执行？
 * 答案：两个线程可以并发访问。不是非得执行完一个方法再执行另外一个方法。
 */

public class SynchonizedStd1 implements Runnable {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Thread-0")){
            method1();
        } else {
            method2();
        }
    }


    public synchronized static void method1() {
        System.out.println("我是静态加锁1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是静态加锁1直行完成");

    }


    public synchronized void method2() {
        System.out.println("我是静态加锁2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是静态加锁2直行完成");


    }


    public static void main(String[] args) {
        SynchonizedStd1 instance = new SynchonizedStd1();
        Thread one = new Thread(instance);
        Thread two = new Thread(instance);
        one.start();
        two.start();

    }


}
