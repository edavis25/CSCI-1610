import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This cell needs our help avoiding the evil
 * viruses while it kicks some bacterial ass!
 */
public class WhiteCell extends Actor
{
    
    
    /**
     * Act: move up and down when cursor keys are pressed. Check for collision
     * with any of the other event related objects.
     */
    public void act() 
    {
        checkKeyPress();
        checkCollision();
    }
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        // UP
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-4);
        }
        // DOWN
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+4);
        }
        // RIGHT
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
        }
        // LEFT
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
        }
    }
    
    /**
     * Checks if we are in contact with another object.
     */
    private void checkCollision()
    {
        // "Casting" so we can call the method. The addScore method is technically
            // only a part of our created world so we have to do this to call the method
            // from world object. Tells Greenfoot that our world is of type Bloodstream 
            // and then we have to store this info into a variable. Then addScore method.
            // Honestly, I'm confused...
        Bloodstream bloodstream = (Bloodstream)getWorld();  // <--"Casting" part
        
        
        // If we are touching Bacteria, destroy it! Add 20 points.
        if (isTouching(Bacteria.class) )
        {
            removeTouching(Bacteria.class);
            Greenfoot.playSound("slurp.wav");
                      
            bloodstream.addScore(20);
            bloodstream.showText("+15", getX(), getY());
        }
        
        // If we are touching a Virus, we lose 100 points :(
        if (isTouching(Virus.class) )
        {
            removeTouching(Virus.class);
            
            bloodstream.addScore(-100);
        }
    }
}
