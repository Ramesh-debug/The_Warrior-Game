import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Size
{
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fireball()
    {
        super(4,4);
    }
    public void act()
    {
        move(-5);
        disappear();
    }
    
    public void disappear()
    {
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
}