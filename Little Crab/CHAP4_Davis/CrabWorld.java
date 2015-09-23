import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);

        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab, 257, 397);
        Lobster lobster = new Lobster();
        addObject(lobster, 258, 86);
        Worm worm = new Worm();
        addObject(worm, 462, 119);
        Worm worm2 = new Worm();
        addObject(worm2, 178, 163);
        Worm worm3 = new Worm();
        addObject(worm3, 48, 93);
        Worm worm4 = new Worm();
        addObject(worm4, 137, 50);
        Worm worm5 = new Worm();
        addObject(worm5, 81, 268);
        Worm worm6 = new Worm();
        addObject(worm6, 47, 471);
        Worm worm7 = new Worm();
        addObject(worm7, 319, 264);
        Worm worm8 = new Worm();
        addObject(worm8, 266, 173);
        Worm worm9 = new Worm();
        addObject(worm9, 435, 83);
        Worm worm10 = new Worm();
        addObject(worm10, 483, 119);
        Worm worm11 = new Worm();
        addObject(worm11, 515, 402);
        Worm worm12 = new Worm();
        addObject(worm12, 437, 512);
        Worm worm13 = new Worm();
        addObject(worm13, 295, 529);
        Worm worm14 = new Worm();
        addObject(worm14, 417, 388);
        Worm worm15 = new Worm();
        addObject(worm15, 166, 507);
        Worm worm16 = new Worm();
        addObject(worm16, 182, 300);
        Worm worm17 = new Worm();
        addObject(worm17, 229, 313);
        Worm worm18 = new Worm();
        addObject(worm18, 110, 388);
        Worm worm19 = new Worm();
        addObject(worm19, 480, 266);
        Worm worm20 = new Worm();
        addObject(worm20, 353, 183);
        Worm worm21 = new Worm();
        addObject(worm21, 330, 40);
        Worm worm22 = new Worm();
        addObject(worm22, 427, 21);
        Lobster lobster2 = new Lobster();
        addObject(lobster2, 429, 319);
        Lobster lobster3 = new Lobster();
        addObject(lobster3, 64, 181);
        removeObject(worm);
        removeObject(worm10);
        removeObject(worm22);
        removeObject(worm8);
        removeObject(worm17);
        removeObject(worm11);
        removeObject(worm15);
        removeObject(worm7);
        removeObject(worm18);
        removeObject(worm4);
        removeObject(worm21);
        removeObject(worm14);
        removeObject(worm16);
        removeObject(worm2);
    }
}