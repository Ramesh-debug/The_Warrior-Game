import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Size
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int i=1;
    public int delayCount = 0;
    
    public Hero()
    {
        super(2,2);
    }
    
    public void act()
    {
        moveUp();
        moveDown();
        moveLeft();
        moveRight();
        range();
        delayCount++;
        if(delayCount > 30)
        {
            firing();
        } 
        try
        {
            disappear();
        }
        catch(Exception e)
        {
            System.out.println("YOU LOSE");
        }
    }
    
    public void moveUp()
    {
        if(Greenfoot.isKeyDown("up") == true)
        {
            this.setLocation(this.getX(),this.getY()-5);
        }
    }
    
    public void moveDown()
    {
        if(Greenfoot.isKeyDown("down") == true)
        {
            this.setLocation(this.getX(),this.getY()+5);
        }
    }
    
    public void moveLeft()
    {
        if(Greenfoot.isKeyDown("left") == true)
        {
            this.setLocation(this.getX()-3,this.getY());         
        }
    }
    
    public void moveRight()
    {
        if(Greenfoot.isKeyDown("right") == true)
        {
            this.setLocation(this.getX()+3,this.getY());
        }
    }
    
    public void range()
    {
        if(isTouching(Chain.class) == true)
        {
            this.setLocation(255,getY());
        }
    }
    
    public void firing()
    {
        if(Greenfoot.isKeyDown("space") == true)
        {
            Bullet b1 = new Bullet();
            getWorld().addObject(b1,this.getX()+30,this.getY()-4);
            Greenfoot.playSound("Bullet.mp3");
            delayCount = 0;
        }
    }
    
    
    public void disappear() throws Exception
    {
        if(isTouching(Bullet1.class) == true)
        {
            this.removeTouching(Bullet1.class);
            i++;
        }
        else if(isTouching(Bullet2.class) == true)
        {
            this.removeTouching(Bullet2.class);
            i++;
        }
        
        else if(isTouching(Fireball.class))
        {
            this.removeTouching(Fireball.class);
            i=i+2;
        }
        if(i>6)
        {
            getWorld().removeObject(this);
            throw new Exception();
        }
    }
}