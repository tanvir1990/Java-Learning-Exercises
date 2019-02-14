import java.util.Random;

public class Agent implements Runnable
{
    int ingredientOne;
    int ingredientTwo;
    String ingOne;
    String ingTwo;


    Thread ChefTwo      = new Thread(new ChefTwo());
    Thread ChefThree    = new Thread(new ChefThree());

    //0 Bread
    //1 PB
    //2 Jam




    public void run(){
     //TODO  Agent puts two ingredients on the table


        System.out.println("Agent Running" );

            //generateIngredientOne();
           // generateIngredientTwo();

        ingredientTwo = 2;
        ingredientOne = 1;
            //System.out.println("one " + ingredientOne + " Two " + ingredientTwo);

        while (!sandwichMade) {
            System.out.println("Agent put the ingredients on the table. \n");
            putIngredientsOnTheTable();
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Agent waits for the chef to make Sandwich. \n");
        }
        sandwichMade = true;
        notify();
    }

    public void setSandwichMade(boolean sandwichMade) {
        this.sandwichMade = sandwichMade;
    }

    boolean sandwichMade = false;

    public boolean isSandwichMade() {
        return sandwichMade;
    }

    private synchronized void putIngredientsOnTheTable() {

//        try {
//            //Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if (ingredientOne == 1 & ingredientTwo == 2)    {
            //TODO send this info to Chef
            //ChefOne chefOne =new ChefOne(ingredientOne, ingredientTwo);
            Thread ChefOne      = new Thread(new ChefOne(ingredientOne, ingredientTwo));
            ChefOne.start();
        }

    }


    public void generateIngredientOne(){                         //Creating Two Random numbers
        Random r = new Random();
        ingredientOne = r.nextInt(3);
    }

    public void generateIngredientTwo(){
        Random r2 = new Random();

        while (ingredientOne == ingredientTwo){
            ingredientTwo = r2.nextInt(3);
        }
    }

    public int getIngredientTwo() {
        return ingredientTwo;
    }

    public int getIngredientOne() {
        return ingredientOne;
    }
}
