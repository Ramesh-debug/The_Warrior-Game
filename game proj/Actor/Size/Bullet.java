import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Size
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int speed=10;
    public Bullet()
    {
        super(3,5);
    }
    public void act()
    {
        move();
        disappear();
    }
    
    public void move()
    {
        this.setLocation(this.getX()+speed,this.getY());
    }
    
    public void disappear()
    {
        if(isAtEdge() == true || isTouching(Wall.class))
        {
            getWorld().removeObject(this);
        }
       
    }
}
