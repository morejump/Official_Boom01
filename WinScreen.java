import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

/**
 * Created by HP on 12/24/2016.
 */
public class WinScreen implements Screen, MouseListener {
    Image imgWin,startAgaint;
    public WinScreen(){
        try {
            imgWin =   ImageIO.read(new File("Resources/Image 1466.png"));
            startAgaint = ImageIO.read(new File("Resources/Image 1531.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Override
    public void pressN() {
        System.out.println("Het cmnr");
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.imgWin,280,300,null);
        g.drawImage(this.startAgaint,300,450,null);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Point p = new Point(e.getX(), e.getY());
        Rectangle rectangle5 = new Rectangle(300, 450, 160, 33);
        if (rectangle5.contains(p)) {
            while (GameManager.getInstance().getStackScreen().size()>1)
                GameManager.getInstance().getStackScreen().pop();

        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
