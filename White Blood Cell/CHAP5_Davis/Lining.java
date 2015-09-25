import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are the objects at the edge of the vein. They are used
 * to create the appearance of movement.
 */
public class Lining extends Actor
{
    /**
     * Slowly moves the lining left and removes it at the edge of the screen.
     */
    public void act() 
    {
        setLocation(getX()-1, getY());
        
        if (getX() == 0)
        {
            getWorld().removeObject(this);
        }
    }    
}
