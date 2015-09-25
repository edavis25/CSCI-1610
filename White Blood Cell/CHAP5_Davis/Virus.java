import greenfoot.*;

/**
 * "Virus" float along and can kill our poor little
 * white blood cell. Avoid these jerks.
 * 
 */
public class Virus extends Actor
{
    /**
     * Action for the Virus. Float along the bloodstream and rotate slowly.
     */
    public void act() 
    {
        setLocation(getX()-4, getY());
        turn(-1);
        
        // Remove itself at far left of screen.
        if (getX() == 0)
        {
            getWorld().removeObject(this);
        }

    }    
}
