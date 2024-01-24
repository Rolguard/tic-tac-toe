import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Entity extends JLabel implements MouseListener {
    private int x;
    private int y;

    public Entity(int x, int y, String imagePath, double scale) throws IOException {
        ImageIcon icon = new ImageIcon(ImageIO.read(new File(imagePath)));
        Image scaledImage = icon.getImage().getScaledInstance(
                (int) (icon.getIconWidth() * scale),
                (int) (icon.getIconHeight() * scale),
                Image.SCALE_DEFAULT);

        super.setIcon(new ImageIcon(scaledImage));
        Border blackLine = BorderFactory.createLineBorder(Color.BLACK);
        super.setBorder(blackLine);

        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Detected left click at: (x, y)");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}
