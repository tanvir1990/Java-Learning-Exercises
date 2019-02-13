import java.util.Random;

public class Agent implements Runnable
{
    int ingredientOne;
    int ingredientTwo;
    String ingOne;
    String ingTwo;

    Thread ChefOne      = new Thread(new ChefOne());
    Thread ChefTwo      = new Thread(new ChefTwo());
    Thread ChefThree    = new Thread(new ChefThree());
    public void run(){
     //TODO  Agent puts two ingredients on the table


        System.out.println("Agent Running" );

        for ( int i = 0; i < 20; i ++){
            generateIngredientOne();
            ingredientOne = getIngredientOne();

            if      (ingredientOne == 0) {ingOne = "Bread";}
            else if (ingredientOne == 1) {ingOne = "PB";}
            else if (ingredientOne == 2) {ingOne = "Jam";}

            while ( ingredientTwo == ingredientOne){
                generateIngredientTwo();
                ingredientTwo = getIngredientTwo();
            }

            if      (ingredientTwo == 0) {ingTwo = "Bread";}
            else if (ingredientTwo == 1) {ingTwo = "PB";}
            else if (ingredientTwo == 2) {ingTwo = "Jam";}



            if ( ingOne.equals("Jam") & ingTwo.equals("PB")){

                ChefOne.start();
                try {
                    ChefOne.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }       //because ChefOne has Bread

            else if ( ingOne.equals("Bread") & ingTwo.equals("Jam")){
                    ChefTwo.start();
            }       //because ChefTwo has PB

            else if ( ingOne.equals("Bread") & ingTwo.equals("PB")){
                ChefThree.start();
                }       //because ChefOne has Jam

            System.out.println("Ingredient one is " + ingOne + " Ingredient Two is " + ingTwo + " and");
        }

        System.out.println("Agent Running Two" );


    }



    public void generateIngredientOne(){                         //Creating Two Random numbers
        Random r = new Random();
        ingredientOne = r.nextInt(3);
    }

    public void generateIngredientTwo(){
        Random r2 = new Random();
        ingredientTwo = r2.nextInt(3);
    }

    public int getIngredientTwo() {
        return ingredientTwo;
    }

    public int getIngredientOne() {
        return ingredientOne;
    }
}
