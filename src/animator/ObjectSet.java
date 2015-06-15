package animator;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.ArrayList;


// Conjunto de objetos da animacao.
class ObjectSet {
    
    private Random rand;
    private Image[] images;
    private ArrayList<Rectangle> rectangles;
    private ArrayList<Circle> circles;
    private ArrayList<Triangle> triangles;
    
    public ObjectSet(){
        rand = new Random();
        rectangles = new ArrayList<Rectangle>();
        circles = new ArrayList<Circle>();
        triangles = new ArrayList<Triangle>();
    }
    
    // Adiciona objetos da classe Image ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addImages(int n, Dimension dim, BufferedImage image, String path, Dimension dimImg,boolean size) {
        System.out.printf("Test: adding %d images\n", n);
        System.out.printf("Test: motion path %s\n", path);
        System.out.printf("Test: motion path %s\n", dim);
        images = new Image[n];
        for (int i = 0; i < images.length; i++) {
            Point p;
            p = new Point(rand.nextInt(dim.width-100),rand.nextInt(dim.height-100));
            images[i] = new Image(p,image,path,dimImg,size);
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addTriangles(int n, Dimension dim, String path,Dimension dimShape,boolean size) {
        System.out.printf("Test: adding %d triangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        for (int i = 0; i < n; i++) {
            Point p;
            p = new Point(rand.nextInt(dim.width-100),rand.nextInt(dim.height-100));
            Triangle triangle = new Triangle(p,path,dimShape,size);
            triangles.add(triangle);
        }    
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addRectangles(int n, Dimension dim, String path,Dimension dimShape,boolean size) {
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        for (int i = 0; i < n; i++) {
            Point p;
            p = new Point(rand.nextInt(dim.width-100),rand.nextInt(dim.height-100));
            Rectangle rectangle = new Rectangle(p,path,dimShape,size);
            rectangles.add(rectangle);
        }
    }
    
    // Adiciona objetos da classe Star ao ObjectSet.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void addCircles(int n, Dimension dim, String path,Dimension dimShape,boolean size) {
        System.out.printf("Test: adding %d rectangles\n", n);
        System.out.printf("Test: motion path %s\n", path);
        for (int i = 0; i < n; i++) {
            Point p;
            p = new Point(rand.nextInt(dim.width-100),rand.nextInt(dim.height-100));
            Circle circle = new Circle(p,path,dimShape,size);
            circles.add(circle);
        }
    }
    
    // Desenha cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void drawAll(Graphics g) {
        System.out.println("drawAll");
        for(Image img: images)
            img.draw(g);
        for(Rectangle rect: rectangles)
            rect.drawRectangle(g);
        for(Circle circ: circles)
            circ.drawCircle(g);
        for(Triangle trian: triangles)
            trian.drawTriangle(g);
    }

    // Move cada um dos objetos da animacao.
    // O codigo abaixo eh somente um teste e precisa ser substituido.
    void moveAll() {
        System.out.println("moveAll");
        for(Image img: images)
            img.move();  
        for(Rectangle rect: rectangles)
            rect.move();
        for(Circle circ: circles)
            circ.move();
        for(Triangle trian: triangles)
            trian.move();
    }

}
