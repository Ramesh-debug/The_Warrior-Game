import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Size
{
    /**
     * Act - do whatever the Block wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int i=1;
    public Enemy enemy;
    public Block()
    {
        super(6,6);
    }
    
    public void act()
    {
        disappear();
    }
    
    public void disappear()
    {
        if(isTouching(Bullet.class))
        {
            this.removeTouching(Bullet.class);
            i++;
        }
        if(i>3)
        {
            getWorld().removeObject(this);
        }
    }
}