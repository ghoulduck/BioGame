import java.awt.*;
import javax.swing.*;

public class Inter {
    private static JFrame gameFrame;
    private GraphicsEnvironment ge;
    private GraphicsDevice gd;
    private GraphicsConfiguration gc;
    private Chloroplast chloroplast;



    public Inter() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();

        chloroplast = Producer.getChloroplast();

        gameFrame = new JFrame("BioFactory", gc);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        if (Game.getFullscreen()) {
            gd.setFullScreenWindow(gameFrame);
        } else {
            gameFrame.setSize(960, 720);
        }

//        JTextArea upgrade = new JTextArea("Upgrades");
//        upgrade.setEditable(false);
//        upgrade.setLineWrap(true);
//        upgrade.setBounds(240, 0, 50, 25);
        JButton buyThylakoid = new JButton("1 Thylakoid");
        buyThylakoid.addActionListener(e -> {
            chloroplast.buy("thylakoid");
        });
        // buyThylakoid.setBounds();
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

        // gameFrame.add(upgrade, BorderLayout.NORTH);
        gameFrame.add(buyThylakoid, BorderLayout.SOUTH);
        gameFrame.add(buyStroma, BorderLayout.EAST);
        gameFrame.add(buyPigment, BorderLayout.WEST);
        gameFrame.add(buyStomata, BorderLayout.CENTER);
        // gameFrame.add(buyRoot, BorderLayout.SOUTH);

        gameFrame.setResizable(false);

        gameFrame.setAlwaysOnTop(false);
        gameFrame.setVisible(true);

    }

    public static JFrame getFrame() {
        return gameFrame;
    }
}
