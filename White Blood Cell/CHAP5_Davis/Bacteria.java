import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * "Bacteria" float along in the bloodstream. They are bad. Help the
 * white blood cell get rid of them and kick some ass.
 */
public class Bacteria extends Actor
{
    private int speed;
    
    /**
     * Constructor. Randomizes the speed of the Bacteria.
     */
    public Bacteria()
    {
        speed = Greenfoot.getRandomNumber(3) + 1;
    }

    /**
     * Float along the bloodstream, slowly rotating.
     */
    public void act() 
    {
        setLocation(getX() - speed, getY());
        turn(1);
        
        // Remove object at left of screen.
        if (getX() == 0) 
        {
            // "Casting" again. I think its like specifying that it is our own special
            // version of the world. This specifies that we are talking about our world
            // and not Greenfoots so we can call the scoring method.
            Bloodstream bloodstream = (Bloodstream)getWorld();
            bloodstream.addScore(-15);
            bloodstream.removeObject(this);
        }
    }
}
