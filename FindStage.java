import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FindStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FindStage extends World
{

    /**
     * Constructor for objects of class FindStage.
     * 
     */
    public FindStage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        Plane player1 = new Plane();
        this.addObject(player1, 30, 40);
        
        Plane player2 = new Plane();
        player2.setRotation(180);
        this.addObject(player2, 600, 40);
    }
}
