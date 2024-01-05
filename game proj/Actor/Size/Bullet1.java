import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet1 extends Size
{
    /**
     * Act - do whatever the Bullet1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public int speed=5;
    public Bullet1()
    {
        super(10,10);
        setRotation(180);
    }
    public void act()
    {
         move(5);
         disappear();
    }
    
    /*public void move()
    {
        this.setLocation(this.getX()-speed,this.getY());
    }*/
    
    public void disappear()
    {
        if((isAtEdge() == true) || (isTouching(Wall.class) == true))
        {
            getWorld().removeObject(this);
        }
    }
   
    
}