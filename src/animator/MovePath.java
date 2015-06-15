/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animator;

import java.awt.Dimension;
import java.awt.Point;
/**
 *
 * @author Microsoft
 */
public class MovePath {
    private int i=0;
    private int cont=0;
    private Point pos;
    private Dimension dim;
    private Point point;
    double ang;
    public void MovePath(Point pos, Dimension dim) {
        this.dim = dim;
        this.pos = pos;
        this.point = pos;
    }
    
    protected void moveLineH() {
            pos.move((int) pos.getX() + 3, (int) pos.getY());
            if ((int) pos.getX() >= 600) {
                pos.move(0,(int)pos.getY());
            }
    }
    protected void moveLineV() {
            pos.move((int) pos.getX(), (int) pos.getY() + 3);
            if ((int) pos.getY() >= 600) {
                pos.move((int) pos.getX(),0);
            }
    }
    protected void moveZoom() {
            if(i==0){
               cont++;
               dim.setSize(dim.getWidth() + cont, dim.getHeight() + cont);
               if(cont==15){
                   i=1;
                   cont=0;
               }
            }
            if (i==1){
                cont++;
                dim.setSize(dim.getWidth() - cont, dim.getHeight() - cont);
                //dim.setSize(largura,altura);
                if(cont==15){
                   i=0;
                   cont=0;
                }
            }
                
    }
    protected void moveZigZag(){
        ang+=0.1;
        if (cont<=360){
            int x = point.x-10;
            int y = point.y;
            int r = 100;
            pos.setLocation(x + (r) * Math.cos(ang),y + (r) * Math.sin(ang));
        } 
        else {
            cont=0;
        }
    }
    
}
