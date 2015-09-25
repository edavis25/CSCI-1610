import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World/Setting for everything. The code will prepare the world
 * and it will also introduce new Lining from the right side of the screen
 * for the animation effect.
 */
public class Bloodstream extends World
{

    private int score;
    
    /**
     * Constructor: Set up the staring objects.
     */
    public Bloodstream()
    {    
        super(780, 360, 1); 
        setPaintOrder(Border.class, WhiteCell.class); // Prioritizing the top-most objects in the layering order.
        score = 0;
        prepare();
        showScore();
    }

    /**
     * Create new floating objects at irregular intervals. Introduce new Lining at the 
     * right side of the screen for animation.
     */
    public void act()
    {
        // Adds the new BACTERIA
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
        
        // Adds new VIRUSES
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        }
        
        // Adds new  RED CELLS
        if (Greenfoot.getRandomNumber(100) < 6)
        {
            addObject(new RedCell(), 779, Greenfoot.getRandomNumber(360));
        }
        
        //Moves the LINING
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Lining(), 779, 359);  //Bottom Lining
            addObject(new Lining(), 779, 0);  //Top Lining
        }
        
    }
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare()
    {
        WhiteCell whitecell = new WhiteCell();
        addObject(whitecell, 105, 179);
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
        
        // Border
        Border border = new Border();
        addObject(border, 0, 180);
        Border border2 = new Border();
        addObject(border2, 770, 180);
    } 
    
    /**
     * Method for adding and keeping score.
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < 0)
        {
            Greenfoot.playSound("game-over.wav");
            Greenfoot.stop();
        }
    }
    
    /**
     * Method for showing the Score
     */
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }
}
