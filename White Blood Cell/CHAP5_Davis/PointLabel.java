import greenfoot.*;

/**
 * The PointLabel will show when eating a Bacteria or touching a Virus. It simply shows a little
 * label that either says "+20" or "-100" for a few seconds where the event occured then it
 * disappears.
 */
public class PointLabel extends Actor
{
    // This counter makes the label stay on screen for a little while
    private int delayCounter;
    
    
    /** CONSTRUCTOR: Creates a variable pointLabel by creating a new greenfoot image and then
     * draws the string (from the parameter 'text') onto the image. Creates the image and displays
     * whatever string is in the parameter.
     */
    public PointLabel(String text)
    {
        GreenfootImage pointLabel = new GreenfootImage(50, 50);    // <--Creating variable
        pointLabel.drawString(text, 2, 20);                        // <--Drawing string on image
        setImage(pointLabel);                                      // <--Set image to variable
        
        delayCounter = 0;                                          // <-- Initialize the delay counter
    }
    
    
    /**
     * A point label will be created whenever a scoring event occurs. The delay counter allows the 
     * point label to linger for a few seconds before it removes itself from the world.
     */
    public void act() 
    {
        if (delayCounter == 40)  //Not sure what 40 actually signifies. I just experimented until the timing felt OK.
        {
            Bloodstream bloodstream = (Bloodstream)getWorld();      // <--The Casting thing again
            bloodstream.removeObject(this);                         // to use the remove object
            delayCounter = 0;                                       // method from the world class.
        }
        
        delayCounter = delayCounter + 1;
    }    
}
