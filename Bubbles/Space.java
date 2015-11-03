import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Space Class. Subclass of World
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        
        
        int i = 0;
        while (i <= 21)
        {
            setup(i);
            i = i +1;
        }
        
    }

    private void setup(int i)
    {
        Bubble bubble = new Bubble();
        addObject(bubble, (30 * i), (30 * i));
    }
    
}
