import greenfoot.*;

/**
 * A floating leaf that blows across the screen.
 *
 * @author Eric Davis
 * @version 1.0
 */
public class Leaf extends Actor
{
    
    // *** DECLARATIONS ***
    private int speed;
    GreenfootImage img1 = new GreenfootImage("leaf-green.png");
    GreenfootImage img2 = new GreenfootImage("leaf-brown.png");
    
    
    
    /**
     * Create the leaf.
     */
    public Leaf()
    {
        setImage(img1);
        speed = Greenfoot.getRandomNumber(3) + 1;      // random speed: 1 to 3
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    
    
    /**
     * Move around. Turns around after hitting the edge.
     */
    public void act() 
    {
        // Turns around when hitting the edge of the world.
        if (isAtEdge()) 
        {
            turn(180);
        }
        
        move(speed);
                
        // Turn the leaves a little bit so they dont look stagnant.
        if (Greenfoot.getRandomNumber(100) < 50) 
        {
            turn(Greenfoot.getRandomNumber(5) - 2);   // -2 to 2
        }
    }
    
    
    
    /**
     * Change the image to another leaf image. This toggles back and
     * forth between two images.
     */
    public void changeImage()
    {
        if (getImage() == img1) 
        {
            setImage(img2);
        }
        else {
            setImage(img1);
        }
    }
}
