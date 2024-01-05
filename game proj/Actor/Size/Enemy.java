import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Size
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delayCount=0;
    public int i=1;
    public Enemy()
    {
        super(8,8);
    }
    
    public void act()
    {
        delayCount++;
        if(delayCount > 200)
        {
            firing1();  
        }  
        disappear();
    }
    
    public void firing1()
    {
        {
            Bullet1 b2 = new Bullet1();
            getWorld().addObject(b2,this.getX()-25,this.getY()-15);
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
