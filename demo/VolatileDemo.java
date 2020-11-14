/**
 * 欢迎关注微信公众号：码农搬砖
 */

public class VolatileDemo {
    private volatile int number = 0;

    public int getNumber() {
        return number;
    }

    public void add() {
        number++;
    }

    public static void main(String[] args) {
        VolatileDemo volatileDemo = new VolatileDemo();

        for (int i = 0; i < 500; i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {
                    volatileDemo.add();
                }
            }).start();
        }

        // 如果线程个数大于1，那么主线程让出资源，直到所有子线程都运行完成，主线程再次直行。
     while(Thread.activeCount() > 1){
         Thread.yield();
     }

     System.out.println("number"+ volatileDemo.getNumber());
    }
}
