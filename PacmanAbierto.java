import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacmanAbierto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanAbierto extends Actor
{
    private static final int MAX_COUNTER_MOUTH=10;
    private GreenfootImage []images;
    private int currentImage;
    private int counterMouth;
    private int offSetX=0;
    private int offSetY=0;
    
   PacmanAbierto()
    {
        images=new GreenfootImage[2];
        images[0] =new GreenfootImage("images/PacmanBocaCerrada.png");
        int miNuevaHeight=(int)images[0].getHeight()/15;
        int miNuevaWidth=(int)images[0].getWidth()/15;
        int miNuevaHeight2=(int)images[0].getHeight()/10;
        int miNuevaWidth2=(int)images[0].getWidth()/10;
        images[0].scale(miNuevaWidth,miNuevaHeight);
        images[1] =new GreenfootImage("images/pacmanBocaAbierta.png");
        images[1].scale(miNuevaHeight2, miNuevaWidth2);
    }
    public void act()
    {
        
             openMouth();
             move();
        
               
    }
    public void openMouth()
    {
        counterMouth++;
        
        if(counterMouth==MAX_COUNTER_MOUTH)
        {
            counterMouth=0;
            setImage(images[currentImage]);
            currentImage=(currentImage+1)%images.length;
        }
        
    }
    public void move()
    {
        
        int currentX=getX();//te da la posicion en x del objeto
        int currentY=getY();//te da la posiscion en y del objetko
        int location;
        if(Greenfoot.isKeyDown("UP"))
        {offSetY=-5;
            
        }else if(Greenfoot.isKeyDown("DOWN"))
        {
            offSetY=5;
        }else if(Greenfoot.isKeyDown("RIGHT"))
        {
            offSetX=5;
        }else if(Greenfoot.isKeyDown("LEFT"))
        {
            offSetX=-10;
        }
        
        
       	Actor pared=getOneObjectAtOffset​(30,0, Pared.class);
       	Actor paredAbajo=getOneObjectAtOffset​(0,30, Pared.class);
       	//Actor paredArriba=getOneObjectAtOffset​(0,-30, Pared.class);
        
        if(pared==null)
        {
            setLocation(currentX+3+offSetX,currentY+offSetY);//transporta al obejto a esas coordenadas
        }else
        {
            setLocation(currentX+(offSetX)-7,currentY+offSetY);
        }
        if(paredAbajo==null)
        {
            setLocation(currentX+3+offSetX,currentY+offSetY);//transporta al obejto a esas coordenadas
        }else
        {
            setLocation(currentX+(offSetX),currentY+(offSetY*(-4)));
        }
        /*if(paredArriba==null)
        {
            setLocation(currentX+3+offSetX,currentY+offSetY);//transporta al obejto a esas coordenadas
        }else
        {
            setLocation(currentX+(offSetX),currentY+(offSetY*(4)));
        }*/
        
        
    
    }
}


