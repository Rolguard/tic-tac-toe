import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.List;

public class App {
    private static final String NOUGHT_IMAGE_PATH = "images/nought2.png";
    private static final String CROSS_IMAGE_PATH = "images/cross2.png";
    private static final double ENTITY_IMAGE_SCALE = 0.2;

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
        Entity nought = new Entity(100, 100, NOUGHT_IMAGE_PATH, ENTITY_IMAGE_SCALE);
        Entity nought2 = new Entity(500, 100, NOUGHT_IMAGE_PATH, ENTITY_IMAGE_SCALE);
        Entity nought3 = new Entity(500, 450, NOUGHT_IMAGE_PATH, ENTITY_IMAGE_SCALE);
        Entity nought4 = new Entity(500, 800, NOUGHT_IMAGE_PATH, ENTITY_IMAGE_SCALE);

        Entity cross = new Entity(300, 100, CROSS_IMAGE_PATH, ENTITY_IMAGE_SCALE);
        Entity cross2 = new Entity(100, 450, CROSS_IMAGE_PATH, ENTITY_IMAGE_SCALE);
        Entity cross3 = new Entity(300, 450, CROSS_IMAGE_PATH, ENTITY_IMAGE_SCALE);
        Entity cross4 = new Entity(100, 600, CROSS_IMAGE_PATH, ENTITY_IMAGE_SCALE);
        Entity cross5 = new Entity(300, 800, CROSS_IMAGE_PATH, ENTITY_IMAGE_SCALE);

        Container mainWindowContentPane = frame.getContentPane();
        // TODO: Use grid layout for tic tac toe entities
        // Try find out why box layout isn't loading 3 more of the noughts/ crosses
        // My understanding is that the JLabels should be lined up in a row
        // But in reality, the nought and crosses are on top of each other
        // and separated by a large y distance
        // Turns out the x and y attributes change the position
        // Even though I haven't implemented any functionality for it
        // JPanel noughtCrossGrid = new JPanel(new GridLayout())
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
