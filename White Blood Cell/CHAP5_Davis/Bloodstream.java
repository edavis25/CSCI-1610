import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World/Setting for everything. The code will prepare the world
 * and it will also introduce new Lining from the right side of the screen
 * for the animation effect.
 */
public class Bloodstream extends World
{

    private int score;
    private int time;
    
    /**
     * CONSTRUCTOR: Set the layer order for how the actors sit on top or underneath one another. Shows and initializes
     * the score in the top left. Creates and prepares the world.
     */
    public Bloodstream()
    {    
        super(780, 360, 1); 
        setPaintOrder(Border.class, PointLabel.class, WhiteCell.class); // Prioritizing the top-most objects in the layering order.
        score = 0;
        showScore();
        time = 2000;
        showTime();
        prepare();
        
    }

    /**
     * Create new floating Bacteria, Virus, RedCells at irregular intervals. Introduce new Lining at the 
     * right side of the screen for animation.
     */
    public void act()
    {
        liningAnimation();        
        createBacteria();
        createVirus();
        createRedCell();
        countTime();
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
     * Method for adding and keeping score. When score is less than zero: game over.
     */
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < 0)
        {
            Greenfoot.playSound("game-over.wav");
            showText("Game Over", (getWidth() / 2), (getHeight() / 2));
            showText("You now have dysentery", (getWidth() / 2), (getHeight() / 2) +25);
            Greenfoot.stop();
        }
    }
    
    /**
     * Method for displaying on screen the "Score"
     */
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }
    
    /**
     * Method for displaying on screen the "Time" left.
     */
    private void showTime()
    {
        showText("Time: " + time, 690, 25);
    }
    
    /**
     * Counting the time down to 0. IF player has positive score AND time is at 0: WIN!
     */
    private void countTime()
    {
        time = time - 1;
        showTime();
        if (time == 0)
        {
            showEndMessage();
            Greenfoot.stop();
        }
    }
    
    /**
     * Displays the ending message when the timer has reached 0. Gets the width/height of the world
     * so it can be divided by 2 to center the text.
     */
    private void showEndMessage()
    {
        showText("Time is up - you win!", (getWidth()/2), (getHeight()/2));
        showText("Your final score: " + score + " points", (getWidth()/2), (getHeight()/2) + 25 ); 
    }
    
    /**
     * Creates new "Bacteria".
     */
    private void createBacteria()
    {
        if (Greenfoot.getRandomNumber(100) < 3)
        {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
    }
    
    /**
     * Creates a new "Virus"
     */
    private void createVirus()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        }
    }
    
    /**
     * Creates new "Red Cell"
     */
    private void createRedCell()
    {
         if (Greenfoot.getRandomNumber(100) < 6)
        {
            addObject(new RedCell(), 779, Greenfoot.getRandomNumber(360));
        }
    }
    
    /**
     * Animates the lining at the top and bottom of the screen.
     */
    private void liningAnimation()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
            addObject(new Lining(), 779, 359);  //Bottom Lining
            addObject(new Lining(), 779, 0);  //Top Lining
        }
    }
}
