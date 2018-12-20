import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ball extends JLabel implements Runnable {
    private ImageIcon iconball = new ImageIcon("球.png");

    private ImageIcon iconbomb1 = new ImageIcon("1.png");
    private ImageIcon iconbomb2 = new ImageIcon("1_1.png");
    private ImageIcon iconbomb3 = new ImageIcon("1_2.png");
    private ImageIcon iconbomb4 = new ImageIcon("1_3.png");
    public int locationM , locationN ;

    private Timer t1;
    public Ball(int x ,int y , int m , int n){
        locationM = m ;
        locationN = n ;

        Ball.this.setBounds(x, y,80,80);
        t1 = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ball.this.setIcon(iconball);
            }
        });
        

    }
    @Override
    public void run() {
        t1.start();

    }
}