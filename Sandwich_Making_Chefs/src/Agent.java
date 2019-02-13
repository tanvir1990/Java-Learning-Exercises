import java.util.Random;

public class Agent implements Runnable
{
    int ingredientOne;
    int ingredientTwo;
    public void run(){
     //TODO  Agent puts two ingredients on the table
        while (ingredientOne != ingredientTwo){
           ingredientOne = generateIngredientOne();
           ingredientTwo = generateIngredientTwo();

        }
    }



    public int generateIngredientOne(){                         //Creating Two Random numbers
        Random r = new Random();
        return r.nextInt(3);
    }

    public int generateIngredientTwo(){
        Random r2 = new Random();
        return r2.nextInt(3);
    }

    public int getIngredientTwo() {
        return ingredientTwo;
    }

    public int getIngredientOne() {
        return ingredientOne;
    }
}
