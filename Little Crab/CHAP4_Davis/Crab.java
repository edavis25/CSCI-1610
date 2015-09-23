import greenfoot.*;

/**
 * Eric Davis
 * CSCI 1610
 * 
 * This class defines a crab. Crabs live on the beach and eat delicious, delicious worms.
 * 
 */

public class Crab extends Actor
{
    // Set class-level variables for the Crab.
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int animationCounter;
    private int wormsEaten;
    
    
    // "Constructor." This method creates starting properties of the crab: (1) adds two images for animation and sets the beginning image.
    // (2) initializes the counters to 0.
    public Crab()             //Inherently retruns nothing and the name is the same as Class name.
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
        animationCounter = 0;
        wormsEaten = 0;
    }
    
    
    // Main Action of the Crab
    public void act()
    {
        checkKeyPress();
        move(3);
        lookForWorm();
        switchImage();
    }
    
    
   /**
    * Method to check if crab is touching a worm. If it is touching then
    * crab eats worm. Also plays sound when eating worm.
    */
   public void lookForWorm()
   {
       if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            Greenfoot.playSound("slurp.wav");
            wormsEaten = wormsEaten + 1;
            if (wormsEaten == 8)  // End game after eating 8 worms.
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
    }
  
      
   /**
   * Method to check the key pressed to turn the crab a small amount. Crab can turn
   * right or left using the directional arrows.
   */
   public void checkKeyPress()
   {
       if (Greenfoot.isKeyDown("left"))
       {
           turn(-4);
        }
        
       if (Greenfoot.isKeyDown("right"))
       {
           turn(4);
        }
       
    }
  
    
   /**
    * Method to switch image for the animation of the crab moving its legs.
    * Animation Counter makes sure crabs legs don't move too fast.
    */
   public void switchImage()
   {
      
       animationCounter = animationCounter + 1;
       if (animationCounter == 5)
       {
           if (getImage() == image1)
           {
               setImage(image2);
               animationCounter = 0;
            }
            else
            {
                setImage(image1);
                animationCounter = 0;
            }
        }
    }
}


