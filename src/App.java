import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.Component;
import java.awt.Container;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        FlatSolarizedLightIJTheme.setup();
        // FlatLightLaf.setup();
        JFrame.setDefaultLookAndFeelDecorated(true);
        // Noughts and crosses
        // Board - Determine if a win happens, if there is a draw
        // Players - Each nought or cross is linked to a player, win counter

        JFrame frame = new JFrame("Tic-tac-toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 720);
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Click me!");
        Entity nought = new Entity(100, 100, "images/nought2.png", 0.4);
        Entity nought2 = new Entity(500, 100, "images/nought2.png", 0.4);
        Entity nought3 = new Entity(500, 450, "images/nought2.png", 0.4);
        Entity nought4 = new Entity(500, 800, "images/nought2.png", 0.4);

        Entity cross = new Entity(300, 100, "images/cross2.png", 0.4);
        Entity cross2 = new Entity(100, 450, "images/cross2.png", 0.4);
        Entity cross3 = new Entity(300, 450, "images/cross2.png", 0.4);
        Entity cross4 = new Entity(100, 800, "images/cross2.png", 0.4);
        Entity cross5 = new Entity(300, 800, "images/cross2.png", 0.4);

        Container mainWindowContentPane = frame.getContentPane();
        mainWindowContentPane.setLayout(new BoxLayout(mainWindowContentPane, BoxLayout.X_AXIS));
        mainWindowContentPane.add(button);
        mainWindowContentPane.add(nought);
        mainWindowContentPane.add(nought2);
        mainWindowContentPane.add(nought3);
        mainWindowContentPane.add(nought4);

        mainWindowContentPane.add(cross);
        mainWindowContentPane.add(cross2);
        mainWindowContentPane.add(cross3);
        mainWindowContentPane.add(cross4);
        mainWindowContentPane.add(cross5);

        frame.setVisible(true);

        // JPanel as a container for components, not the window, just contains an area
        // of the window

        // Look at GridLayout and GridBagLayout

        // TODO: Look at SwingUtilities.invokeLater(new Runnable()) for
        // GUI updates to enable a more responsive Swing program
    }
}
