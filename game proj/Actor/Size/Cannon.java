import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cannon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cannon extends Size
{
    /**
     * Act - do whatever the Cannon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int delaytime=0;
    public int speed=2;
    public int i=1;
    public Cannon()
    {
        super(2,2);
        setRotation(270);
    }
    public void act()
    {
        toAndFro();
        move(speed);
        delaytime++;
        if(delaytime>400)
        {
            firing();
        }
        disappear();
    }
    
    public void toAndFro()
    {
        if(getY() == 0)
        {
            speed=-2;
        }
        if(getY() == 499)
        {
            speed=2;
        }
    }
    
    public void firing()
    {
        Fireball f1=new Fireball();
        getWorld().addObject(f1,this.getX()-10,this.getY()-10);
        delaytime=0;
    }
    
    public void disappear()
    {
        if(isTouching(Bullet.class) == true)
        {
            this.removeTouching(Bullet.class);
            i++;
            if(i>8)
            {
                getWorld().removeObject(this);
                System.out.println("YOU WIN");
            }
        }
    }
    
}