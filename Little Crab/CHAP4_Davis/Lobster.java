import greenfoot.*;

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turnAtEdge();
        randomTurn();
        move(3);
        lookForCrab();
    } 
    
    
    /**
    * Method to check if lobster is touching a crab. If it is touching then
    * lobster eats crab. After eating crab: play sound and stop program.
    */
   public void lookForCrab()
   {
       if (isTouching(Crab.class))
        {
            removeTouching(Crab.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
    
    /**
    * Method to check if Lobster is at edge of the world.
    * If Lobster is at the edge, he will then turn.
    */
   public void turnAtEdge()
   {
       if (isAtEdge() )
        {
            turn(17);
        }
    }
    
    /**
   * Method to randomly turn the lobster a small amount. This is to make the 
   * lobster move in a line that is not completely straight.
   */
   public void randomTurn()
   {
       if (Greenfoot.getRandomNumber(100) < 10) 
        {
            turn(Greenfoot.getRandomNumber(90) -45 );
        }
    }
}
