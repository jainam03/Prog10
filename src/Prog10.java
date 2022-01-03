/*Problem statement: Create two threads such that one thread will print even number and 
another will print odd number in an ordered fashion.*/

class Thrd1 extends Thread {    //extending an inbuilt class Thread
    public void run() {      // this method is used to perform action for a thread
        int i;
        for(i=1;i<=10;i=i+2) {
            System.out.print(" " +i);
            
            try {
                Thread.sleep(850);  //the method Thread.sleep(); sets the delay time of the thread
            }
            catch(InterruptedException e) {
                System.out.println("Thread A interrupted.");
            }
        }
        //System.out.println("\nExiting thread A");
    }
}

class Thrd2 extends Thread {
    public void run() {
        int i;
        for(i=2;i<=10;i=i+2) {
            System.out.print(" " +i);
            try {
                Thread.sleep(900);  //the method Thread.sleep(); helps to set the synchronization between 2 threads
            }
            catch(InterruptedException e) {
                System.out.println("Thread B interrupted.");
            }
        }
        //System.out.println("\nExiting thread B.");
    }
}


class Prog10 {
    //the main method
	public static void main(String[] args) {
        Thrd1 t1 = new Thrd1();
        t1.start();          //calling the inbuilt start method
        Thrd2 t2 = new Thrd2();
        t2.start();      
        
    }
    
   
}
