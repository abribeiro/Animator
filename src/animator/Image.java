package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;

// Uma imagem na animacao.
class Image extends MovePath{

    BufferedImage img;
    Point pos;
    String trajetoria;
    private Random rand;
    Dimension dim;
    
    public Image(Point p, BufferedImage img, String path,Dimension dimImg,boolean size) {
        this.pos = p;
        this.img = img;
        this.trajetoria = path;
        if(size){
            rand = new Random();
            int x = 20 + rand.nextInt(150);
            dim = new Dimension (x,x); 
        }
        else
            this.dim = dimImg;
        super.MovePath(pos,dim);
    }

    public Point getPos() {
        return pos;
    }
    
    public void draw(Graphics g) {
       // g.drawImage(img, (int) pos.getX(), (int) pos.getY(), null);
        g.drawImage(img, (int) pos.getX(), (int) pos.getY(), dim.width,dim.height,null);
    }
    
    // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move() {
        //moveImg = new MovePath (pos,dim);
        if("Line H".equals(trajetoria)){
            moveLineH();
        }
        if("Line V".equals(trajetoria)){
            moveLineV();
        }
        if("Zoom".equals(trajetoria)){
            moveZoom();
        }
    }
}
