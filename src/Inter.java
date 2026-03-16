import java.awt.*;
import javax.swing.*;

public class Inter {
    private static JFrame gameFrame;

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

        JButton buyThylakoid = new JButton("Thylakoid");
        buyThylakoid.addActionListener(e -> {
            Producer.getChloroplast().buy("thylakoid");
        });
        buyThylakoid.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton buyStroma = new JButton("Stroma");
        buyStroma.addActionListener(e -> {
            Producer.getChloroplast().buy("stroma");
        });
        buyStroma.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton buyPigment = new JButton("Pigment");
        buyPigment.addActionListener(e -> {
            Producer.getChloroplast().buy("pigment");
        });
        buyPigment.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton buyStomata = new JButton("Stomata");
        buyStomata.addActionListener(e -> {
            Producer.getChloroplast().buy("stomata");
        });
        buyStomata.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton buyRoot = new JButton("Root");
        buyRoot.addActionListener(e -> {
            Producer.getChloroplast().buy("root");
        });
        buyRoot.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel componentLabel = new JLabel("Components");
        componentLabel.setFont(new Font("Arial", Font.BOLD, 28));
        componentLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1, 10, 20));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(40, 100, 40, 100));
        buttonPanel.add(componentLabel);
        buttonPanel.add(buyThylakoid);
        buttonPanel.add(buyStroma);
        buttonPanel.add(buyPigment);
        buttonPanel.add(buyStomata);
        buttonPanel.add(buyRoot);

        gameFrame.add(buttonPanel, BorderLayout.CENTER);

        gameFrame.setResizable(false);
        gameFrame.setAlwaysOnTop(false);
        gameFrame.setVisible(true);
    }

    public static JFrame getFrame() {
        return gameFrame;
    }
}