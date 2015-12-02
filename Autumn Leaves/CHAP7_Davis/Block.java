import greenfoot.*;
import java.util.List;

/**
 * A block that bounces back and forth across the screen. Different events occur whenever the block hits the edge of the screen.
 * When reaching an edge, the block will switch directions, the apples will rotate, and the pear will move. This class is also
 * responsible for checking the mouse click and changing the images of the leaves.
 * 
 * @author Eric Davis
 * @version 1.0
 */
public class Block extends Actor
{
    
    // *** DECLARATIONS ***
    private int delta = 2;      //<--- Delta will be used to determine if we move right or left later.
    
    
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        checkLeaf();
        
    }
    
    
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around. When reaching the edge of the world, rotate
     * all apples in the apple class by 90 degrees.
     */
    private void checkEdge()
    {
        World world = getWorld();
        List<Apple> apples = world.getObjects(Apple.class);
        
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
                        
            for (Apple apple : apples)
            {
                apple.turn(90);
            }
            
            
        }
    }
    
    
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves. First line of code creates a variable declaration for world
     * so I can call the getObjects. The second is the List java library method that creates a list of whatever class is inside of the <> and
     * then assigns the list to 'leaves'.
     * (In this case only instances of the "Leaf" class are listed). After getting the list of leaves, run a FOR loop to change the image of 
     * all the leaves listed.
     * 
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            World world = getWorld();
            List<Leaf> leaves = world.getObjects(Leaf.class);
            
            for (Leaf leaf : leaves)
            {
                leaf.changeImage();
            }
        }
    }
    
    
    
    /**
     * If the block runs into a leaf, the touching leaf will be turned to move in a different direction.
     */
    private void checkLeaf()
    {
        Leaf leaf = (Leaf) getOneIntersectingObject(Leaf.class);
        if (leaf != null)
        {
            leaf.turn(9);
        }
    }
    
    
}
