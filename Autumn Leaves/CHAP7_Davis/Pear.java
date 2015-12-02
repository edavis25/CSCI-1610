import greenfoot.*;

/**
 * The Pear moves 20 pixels whenever the block hits the edge. When the pear itself reaches an edge,
 * it will begin moving in the opposite direction.
 * 
 * @author Eric Davis
 * @version 1.0
 */
public class Pear extends Actor
{
    
    // *** DECLARATIONS ***
    private int delta = 20;
    
    
    
    /**
     * Act - do whatever the Pear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    } 
    
    
    
    /**
     * Instructions to move the pear. When the block hits the edge of the world, the pear moves 20
     * pixels. The nested if is needed to keep the pear from getting stuck on the edge. Without
     * the 2nd IF, the pear will get stuck on the edge because isAtEdge will forever be true and
     * delta will just keep flipping between the 2 values and thus will forever stay in place.
     */
    private void move()
    {
        MyWorld world = (MyWorld) getWorld();
        if (world.blockAtEdge())
        {
            move(delta);
            
            if (this.isAtEdge())
            {
                delta = -delta;
            }
        }
        
    }
}
