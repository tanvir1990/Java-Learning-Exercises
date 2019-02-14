
public class ChefOne implements Runnable
{
    public static final String ingredientUnlimited = "Bread";
    public String secondIngredient;
    public String thirdIngredient;

    Agent agent = new Agent();

    public ChefOne(int secondIngredient, int thirdIngredient){

        if (secondIngredient == 1 || secondIngredient == 2) {this.secondIngredient = "PB";}
        if (thirdIngredient == 2 || thirdIngredient == 1){this.thirdIngredient = "Jam";}
    }

    @Override
    public void run(){


        System.out.println("Chef one running");

//        while (!agent.isSandwichMade()) {
//            try {
//               wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
        makeSandwich();

        agent.setSandwichMade(true);

        //notifyAll();
        //TODO Chef takes two ingredients from the Agent

        //TODO Chef makes the sandwich

        //TODO Chef notifies the Agent

    }

    private synchronized void makeSandwich() {
        System.out.println("Chef one recieved " + secondIngredient + "and " + thirdIngredient +
                "from Agent. " + " and made the sandwich. ");
    }


    public static String getIngredientUnlimited() {
        return ingredientUnlimited;
    }

    public String getSecondIngredient() {
        return secondIngredient;
    }

    public String getThirdIngredient() {
        return thirdIngredient;
    }

    public void setSecondIngredient(String secondIngredient) {
        this.secondIngredient = secondIngredient;
    }

    public void setThirdIngredient(String thirdIngredient) {
        this.thirdIngredient = thirdIngredient;
    }
}
