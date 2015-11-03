import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
        
        int count = 0;
        while (count < 19)
        {
            addObject(new Leaf(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            count = count + 1;
            
        }
    }
}
