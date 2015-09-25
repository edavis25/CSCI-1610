import greenfoot.*;

/**
 * Red Blood Cells do not really do anything, they are just cosmetic.
 */
public class RedCell extends Actor
{
    private int speed;
    
    /**
     * Constructor for the Red Blood cell
     */
    public RedCell()
    {
        // Randomize the speed of Red Blood Cells
        speed = Greenfoot.getRandomNumber(2) + 1;
        
        // Randomize the rotation of the Red Cells
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    
    /**
     * Moves slowly from right to left on the screen.
     */
    public void act() 
    {
        setLocation(getX() - speed, getY());
        turn(1);
    }    
}
