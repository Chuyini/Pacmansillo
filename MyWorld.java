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
    {    Pared pared=new Pared();
        SmallBall bola=new SmallBall();
        int widthPared= pared.getImage().getWidth();
        int x,y, der;
        int widthSmallBall=bola.getImage().getWidth();
        boolean tocando;
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

        addObject(pacman,100,110);

        
        
        
        BigBall bigBall = new BigBall();
        addObject(bigBall,516,108);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,517,332);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,78,338);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,297,343);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,496,222);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,309,111);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,98,239);
        banana banana = new banana();
        addObject(banana,296,217);
        fresa fresa = new fresa();
        addObject(fresa,395,331);
        Cherry cherry = new Cherry();
        addObject(cherry,198,326);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,394,223);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,199,232);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,393,155);
        SmallBall smallBall8 = new SmallBall();
        addObject(smallBall8,240,171);
        SmallBall smallBall9 = new SmallBall();
        addObject(smallBall9,205,118);
        SmallBall smallBall10 = new SmallBall();
        addObject(smallBall10,434,113);
    }
    

    
}
