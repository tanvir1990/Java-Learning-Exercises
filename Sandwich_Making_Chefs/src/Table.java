public class Table
{
    public static void main(String[] args) {
        new Thread(new ChefOne()).start();
        new ChefTwo().start();

        //TODO Algorithm


    }

    public void makeSandwiches(){
        int i = 0;

        //Ingredients that chef has
        String chefOne = "bread";
        String chefTwo = "peanut";
        String chefThree = "butter";

        //Agent Randomly Generates two Ingredients


        for ( i = 0; i<20 ; i++){
            /*
         1. Agent randomly puts two ingredients
         2. Chef makes the Sandwich
         3. Chef notifies the Agent
         4. Agent again puts two ingredients
         */
        }
    }
}
