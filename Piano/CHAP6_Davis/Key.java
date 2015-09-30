import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String upImage;
    private String downImage;
    
    /**
     * Create a new key. Set Up and Down image to img1 & img2 respectfully.
     * Initialize image to Up image and isDown to false.
     */
    public Key(String keyName, String soundFile, String img1, String img2)
    {
        key = keyName;
        sound = soundFile;
        upImage = img1;
        downImage = img2;
        setImage(upImage);
        isDown = false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        
        if  ( !isDown && (Greenfoot.isKeyDown(key)) )
        {
            play();
            setImage(downImage);
            isDown = true;            
        }
        if ( isDown && !Greenfoot.isKeyDown(key) )
        {
            setImage(upImage);
            isDown = false;
        }
    }
    
    /**
     * Method for playing the notes on a key
     */
    public void play()
    {
        Greenfoot.playSound(sound);
    }
}

