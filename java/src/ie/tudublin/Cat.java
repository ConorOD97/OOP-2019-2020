package ie.tudublin;

public class Cat extends Animal
{
    private int numLives = 9;

    public void setNumLives(int lives)
    {
        this.numLives = lives;
    }
    public int getNumLives()
    {
        return numLives;
    }

    public void kill(){
        if (numLives > 0){
            System.out.println("Ouch");
            numLives--;
        
        if (numLives == 0){
            System.out.println("Dead");
        }
        }
    }

    public void speak()
    {
        System.out.println("Meow!");
    }
}