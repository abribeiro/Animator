/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;
    import java.awt.Dimension;
    import java.awt.Graphics;
    import java.awt.Point;
    import java.util.Random;
    import java.awt.Color;
    import java.awt.Polygon;
/**
 *
 * @author Microsoft
 */
public class Triangle extends MovePath{
    private Point pos;
    private String trajetoria;
    private Random rand;
    private Color cor;
    Polygon triangle;
    private Dimension dim;
  
    public Triangle (Point p, String path,Dimension dimShape,boolean size){
        this.pos = p;
        this.trajetoria = path;
        rand = new Random();
        if(size){
            int x = 10 + rand.nextInt(150);
            int y = 10 + rand.nextInt(150);
            dim = new Dimension (x,y); 
        }
        else
            this.dim = dimShape;
        this.cor = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        super.MovePath(pos,dim);

    }

    public void drawTriangle(Graphics g) {
        triangle = new Polygon();
        triangle.addPoint((int) pos.getX() ,(int) pos.getY());
        triangle.addPoint((int) pos.getX() - dim.width,(int) pos.getY() + dim.height);
        triangle.addPoint((int) pos.getX() + dim.width,(int) pos.getY() + dim.height);
        g.setColor(cor);
        g.fillPolygon(triangle);
    }
        // Move a imagem de acordo segundo a trajetoria selecionada.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    public void move() {
        //moveShape = new MovePath (pos,dim);
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
