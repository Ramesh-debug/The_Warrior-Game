import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Size
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delayCount=0;
    public int i=0;
    public Enemy1()
    {
        super(2,2);
    }
    public void act()
    {
        delayCount++;
        if(delayCount > 170)
        {
            firing2();
        } 
        disappear();
    }
    
    public void firing2()
    {
        {
            Bullet2 b3 = new Bullet2();
            getWorld().addObject(b3,this.getX()-20,this.getY()-25);
            delayCount = 0;
        }
    }
    
     public void disappear()
    {
        if(isTouching(Bullet.class))
        {
            this.removeTouching(Bullet.class);
            i++;
        }
        if(i>2)
        {
            getWorld().removeObject(this);
        }
    }    
    
}