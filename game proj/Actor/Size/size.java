package Actor.Size;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Size here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Size extends Actor
{
    /**
     * Act - do whatever the Size wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Size(int h,int w)
    {
        this.getImage().scale(this.getImage().getWidth()/w,this.getImage().getHeight()/h);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
