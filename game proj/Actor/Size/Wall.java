import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Size
{
    /**
     * Act - do whatever the wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed=4;
    public Wall()
    {
        super(5,5);
        setRotation(90);
        
    }
    public void act()
    {
         toAndFro();
         move(speed);
    }
    
    public void toAndFro()
    {
        if(getY() == 0)
        {
             speed=4;
        }
        else if(getY() == 499)
        {
             speed=-4;
        }
    }
    
   
}