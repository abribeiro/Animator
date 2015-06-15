package animator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

// Area onde eh mostrada a animacao.
class AnimationPanel extends JPanel implements Runnable {

    private Dimension dim;
    private ObjectSet objs;
    private int millis;

    public AnimationPanel(ObjectSet objs, Dimension dim, int millis) {
        this.setBackground(Color.BLACK);
        this.objs = objs;
        this.dim = dim;
        this.millis = millis;
    }

    @Override
    public Dimension getPreferredSize() {
        return dim;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        objs.drawAll(g);
    }

    @Override
    public void run() {
        boolean isRunning = true;
        System.out.println("Running");
        while (isRunning) {
            objs.moveAll();
            repaint();
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                isRunning = false;
                System.out.println("Stopped");
            }
        }
    }
}

