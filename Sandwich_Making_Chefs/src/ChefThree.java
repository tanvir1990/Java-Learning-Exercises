public class ChefThree implements Runnable {
    public void run(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("Chef Three Running from " + Thread.currentThread().getName());
    }
}
