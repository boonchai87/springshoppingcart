package basic;

public class RunableExample implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        RunableExample r =new RunableExample();
        Thread t1 =new Thread(r);
        t1.run();
    }
}
/*

class Multi3 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Multi3 m1=new Multi3();
        Thread t1 =new Thread(m1);
        t1.start();
    }
}
*/
