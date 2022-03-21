import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
 
    /*   public class PacmanAbierto extends Actor
    {
    public PacmanAbierto()
    {
    GreenfootImage miImagen=getImage();
    int miNuevaHeight=(int)miImagen.getHeight()/2;
    int miNuevaWidth=(int)miImagen.getWidth()/2;
    miImagen.scale(miNuevaWidth, miNuevaHeight);
    }

    }*/

    private void prepare()
    {        Pared pared=new Pared();
        int widthPared= pared.getImage().getWidth();
        int x,y, der;
        for( x=30;x<600;x=widthPared+x)
        {
            pared=new Pared();
            addObject(pared,x,30);
        }
        der=x;
        for(y=30;y<600;y=widthPared+y)
        {
            pared=new Pared();
            addObject(pared,30,y);
        }

        for( x=30;x<600;x=widthPared+x)
        {
            pared=new Pared();
            addObject(pared,x,y);
        }
        for(y=30;y<600;y=widthPared+y)
        {
            pared=new Pared();
            addObject(pared,der,y);
        }

        PacmanAbierto pacman=new PacmanAbierto();
        GreenfootImage miImagen=pacman.getImage();
        int miNuevaHeight=(int)miImagen.getHeight()/14;
        int miNuevaWidth=(int)miImagen.getWidth()/14;
        pacman.getImage().scale(miNuevaWidth,miNuevaHeight);

        addObject(pacman,90,110);

        SmallBall smallBall = new SmallBall();
        addObject(smallBall,223,146);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,297,255);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,384,169);
    }
    

    
}
