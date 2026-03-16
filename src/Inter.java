import java.awt.*;
import javax.swing.*;

public class Inter {
    private static JFrame gameFrame;
    private GraphicsEnvironment ge;
    private GraphicsDevice gd;
    private GraphicsConfiguration gc;



    public Inter() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();


        gameFrame = new JFrame("BioFactory", gc);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (Game.getFullscreen()) {
            gd.setFullScreenWindow(gameFrame);
        } else {
            gameFrame.setSize(960, 720);
        }
        gameFrame.setResizable(false);

        gameFrame.setAlwaysOnTop(false);
        gameFrame.setVisible(true);

        JTextArea upgrade = new JTextArea("Upgrades");
        JButton buyThylakoid = new JButton("1 Thylakoid");
        buyThylakoid.addActionListener(e -> {
        });
        JButton buyStroma = new JButton("1 Stroma");
        buyStroma.addActionListener(e -> {
        });
        JButton buyPigment = new JButton("1 Pigment");
        buyPigment.addActionListener(e -> {
        });
        JButton buyStomata = new JButton("1 Stomata");
        buyStomata.addActionListener(e -> {
        });
        JButton buyRoot = new JButton("1 Root");
        buyRoot.addActionListener(e -> {
        });

    }

    public static JFrame getFrame() {
        return gameFrame;
    }
}
