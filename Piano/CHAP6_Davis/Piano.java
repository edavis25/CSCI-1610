import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 */
public class Piano extends World
{
    // These are the arrays for all the key names and names for soundfiles.
    private String[] whiteKeys =
        {"a", "s", "d", "f", "g", "h", "j", "k", "l", ";", "'", "enter"};
    private String[] whiteNotes =
        {"3c", "3d", "3e", "3f", "3g", "3a", "3b", "4c", "4d", "4e", "4f", "4g"};
    private String[] blackKeys =
        {"w", "e", "", "t", "y", "u", "", "o", "p", "", "]"};
    private String[] blackNotes =
        {"3c#", "3d#", "", "3f#", "3g#", "3a#", "", "4c#", "4d#", "", "4f#"};
   
    
    
    /**
     * Make the piano.
     */
    public Piano() 
    {
        super(800, 340, 1);
        
        makeKeys();
        
    }
    
    /**
     * Method to create the keys for the piano. Called from Piano constructor.
     * Uses a While loop to create the keys. The keys themselves are 280 pixels
     * height by 63 pixels wide. Sets the creation of a Key into a variable and
     * then uses the 'i' value to find appropriate Key name and Sound from the 
     * arrays defined above.
     */
    public void makeKeys()
    {
           
        int i = 0;
        while (i < whiteKeys.length)
        {
            Key key = new Key(whiteKeys[i], whiteNotes[i] + ".wav", "white-key.png", "white-key-down.png");
            addObject(key, (i*63 + 54), 140);            
            i = i + 1;
        }
        
        int x = 0;
        while (x < blackKeys.length)
        {
            if ( blackKeys[x] != ("") )
                {
                    Key key = new Key(blackKeys[x], blackNotes[x] + ".wav", "black-key.png", "black-key-down.png");
                    addObject(key, (x * 63 + 85), 86);
                }
            x = x + 1;
        }
        
    }
}