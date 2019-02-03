import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        Actor qCoin;
        qCoin = getOneObjectAtOffset(0,0,Quarter.class);
        if (qCoin != null)
        {
            World world;
            world = getWorld();
            world.removeObject(qCoin);
            System.out.print("Get Coin");
        }
    }    
}
