import greenfoot.*;

/**
 * Autumn. A world with some leaves, apples, pears, and a block. Different events are triggered
 * when the block hits the edge of the world and when the user clicks the mouse.
 * 
 */

public class MyWorld extends World
{
    
    //*** DECLARATIONS ***
    private Block theBlock;
    
    
    
    
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
    }
    
   
    
    
    /**
     * Create the initial objects in the world. Use while loops to create the different
     * objects. 1 block, 18 leaves, 12 apples, 8 pears. Added a value to the getRandomNumber
     * method calls to make sure objects do not spawn halfway outside of the world.
     */
    private void setUp()
    {
        // Create the block ---> (place in the middle)
        theBlock = new Block();
        addObject(theBlock, 300, 200);
        
        
        // Create 18 leaves ---> (the value added to getRandomNnumber creates edge padding)
        int count = 0;
        while (count < 18)
        {
            addObject(new Leaf(), Greenfoot.getRandomNumber(560) + 20, Greenfoot.getRandomNumber(360) + 15);
            count = count + 1;
            
        }
                
        
        // Create 12 apples ---> (the value added to getRandomNnumber creates edge padding)
        int appleCount = 0;
        while (appleCount < 12)
        {
            addObject(new Apple(), Greenfoot.getRandomNumber(560) + 20, Greenfoot.getRandomNumber(360) + 15);
            appleCount = appleCount + 1;
        }
        
        
        // Create 8 pears ---> (the value added to getRandomNnumber creates edge padding)
        int pearCount = 0;
        while (pearCount < 8)
        {
            addObject(new Pear(), Greenfoot.getRandomNumber(550) + 25, Greenfoot.getRandomNumber(350) + 25);
            pearCount = pearCount + 1;
        }
    }
    
    
    
    
    /**
     * Returns a boolean indicating if the block is touching an edge.
     */
    public boolean blockAtEdge()
    {
        return theBlock.isAtEdge();
    }
}
