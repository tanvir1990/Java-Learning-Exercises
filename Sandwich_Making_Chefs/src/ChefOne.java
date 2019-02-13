
public class ChefOne implements Runnable
{
    public static final String ingredient = "PeanutButter";
    @Override
    public void run(){


        System.out.println("Chef one running from" + Thread.currentThread().getName());
        notify();
        //TODO Chef takes two ingredients from the Agent

        //TODO Chef makes the sandwich

        //TODO Chef notifies the Agent

    }
}
