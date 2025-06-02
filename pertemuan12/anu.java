package paradigma;
class ThreadOne extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread One: " + i);
        }
        System.out.println("Exit T1");
    }
}

class ThreadTwo extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread Two: " + i);
        }
        System.out.println("Exit T2");
    }

}


public class anu {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        
        t1.start(); t2.start();
        
        try {
            t1.join(); // Wait for ThreadOne to finish
            t2.join(); // Wait for ThreadTwo to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
