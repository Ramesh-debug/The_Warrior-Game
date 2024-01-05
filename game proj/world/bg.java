package world;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bg extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int gap=0;
    public int gap1=0;
    public int gap3=0;
    public int enemyCount = 0;
    public int gap4=0;
    
    public Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 500, 1); 
        addHero();
        addChain();
        addBrick();
        addBlockEnemy1();
        act();
        addBlockEnemy2();
        addWall();
        addBlockEnemy3();
        addLife();
        addCannon();
    }
    
    public void addHero()
    {
        Hero h1 = new Hero();
        addObject(h1,50,320);
    }
    
    public void addLife()
    {
        
        for(int i=0;i<5;i++)
        {
            Life l1=new Life();
            addObject(l1,15+gap4,30);
            gap4=gap4+35;
        }
        
    }
    
    public void addChain()
    {
        Chain c1 = new Chain();
        addObject(c1,308,400);
        Chain c2 = new Chain();
        addObject(c2,308,100);
    }
    
    public void addBrick()
    {
        Brick b1 = new Brick();
        addObject(b1,300,0);
        Brick b2 = new Brick();
        addObject(b2,300,599);
    }
    
    public void addWall()
    {
        Wall w1 = new Wall();
        addObject(w1,500,250);
    }
    
   
    
    public void addCannon()
    {
        Cannon c1=new Cannon();
        addObject(c1,1046,450);
    }
    
    public void addBlockEnemy1()
    {
        for(int i=0;i<2;i++)
        {
            Block b1=new Block();
            Enemy e1 = new Enemy();
            addObject(e1,938,75+gap);
            addObject(b1,885,75+gap);
            gap=gap+218;
        }
    }
    
    public void addBlockEnemy2()
    {
        for(int i=0;i<2;i++)
        {
            Block b2=new Block();
            Enemy1 e2 = new Enemy1();
            addObject(e2,930,180+gap1);
            addObject(b2,885,184+gap1);
            gap1=gap1+218;
        }
    }
    
    public void addBlockEnemy3()
    {
        for(int i=0;i<2;i++)
        {
            Block b3=new Block();
            Enemy e1 = new Enemy();
            addObject(e1,720,28+gap3);
            addObject(b3,665,28+gap3);
            gap3=gap3+440;
        }
    }   
}
