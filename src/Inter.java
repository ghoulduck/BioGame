import java.awt.*;
import javax.swing.*;

public class Inter {
    private JFrame gameFrame;
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

        /*Button button = new Button("test");
        button.addActionListener(new ButtonListener());
        button.setSize(50, 50);
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20)); */

        // gameFrame.add(button);

        // gameFrame.
        gameFrame.setResizable(false);

        gameFrame.setAlwaysOnTop(false);
        gameFrame.setVisible(true);

    }
}
