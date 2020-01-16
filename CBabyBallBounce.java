import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.*;

public class CBabyBallBounce extends JFrame implements ActionListener
{
	private static final String EXIT_ON_CLOSE = null;
    private JPanel game;
    private JPanel settings;
    private JPanel controls;
    
    public static void main(String[] args) {
        final CBabyBallBounce frame = new CBabyBallBounce();
        frame.setSize(835, 585);
        frame.createGUI();
        frame.setVisible(true);
    }
    
    private void createGUI() {
        setDefaultCloseOperation(3);
        Container window = this.getContentPane();
        window.setLayout(new BorderLayout());
        JPanel pitch = new JPanel();
        pitch.setPreferredSize(new Dimension(600, 400));
        pitch.setBackground(Color.white);
        game.add(pitch);
        window.add(game, "West");
        settings.setLayout(new FlowLayout());
        settings.setBorder(BorderFactory.createLineBorder(Color.black));
        JLabel digitaltimer = new JLabel("                                      Digtal Timer                                        ");
        settings.add(digitaltimer);
        JTextField hours = new JTextField("00");
        hours.setOpaque(true);
        hours.setForeground(Color.white);
        hours.setBackground(Color.black);
        settings.add(hours);
        JLabel label1 = new JLabel(":");
        settings.add(label1);
        JTextField minutes = new JTextField("00");
        minutes.setOpaque(true);
        minutes.setForeground(Color.white);
        minutes.setBackground(Color.black);
        settings.add(minutes);
        JLabel label2 = new JLabel(":");
        settings.add(label2);
        JTextField seconds = new JTextField("00");
        seconds.setOpaque(true);
        seconds.setForeground(Color.white);
        seconds.setBackground(Color.black);
        settings.add(seconds);
        JLabel score = new JLabel("                           Score                           ");
        settings.add(score);
        JTextField scorel = new JTextField("00");
        scorel.setOpaque(true);
        scorel.setForeground(Color.white);
        scorel.setBackground(Color.black);
        settings.add(scorel);
        JLabel lr = new JLabel("< L:R >");
        settings.add(lr);
        JTextField scorer = new JTextField("00");
        scorer.setOpaque(true);
        scorer.setForeground(Color.white);
        scorer.setBackground(Color.black);
        settings.add(scorer);
        JLabel option = new JLabel("Option:             ");
        settings.add(option);
        JTextField option2 = new JTextField("2 player");
        settings.add(option2);
        JLabel square = new JLabel("Square:                   ");
        settings.add(square);
        JTextField square2 = new JTextField("101");
        settings.add(square2);
        JLabel direction = new JLabel("Direction:                 ");
        settings.add(direction);
        JTextField direction2 = new JTextField("SE");
        settings.add(direction2);
        JButton button = new JButton("  ");
        settings.add(button);
        JButton button2 = new JButton("^");
        settings.add(button2);
        JButton button3 = new JButton("  ");
        settings.add(button3);
        JButton button4 = new JButton("<");
        settings.add(button4);
        
        JButton button5 = new JButton("B");
        settings.add(button5);
        JButton button6 = new JButton(">");
        settings.add(button6);
        JButton button7 = new JButton("  ");
        settings.add(button7);
        JButton button8 = new JButton("v");
        settings.add(button8);
        JButton button9 = new JButton("  ");
        settings.add(button9);
        window.add(this.settings, "East");
        controls.setLayout(new FlowLayout());
        Icon icon = new ImageIcon("images/step.png");
        JButton actionButton = new JButton("Act", icon);
        controls.add(actionButton);
        Icon icon2 = new ImageIcon("images/run.png");
        JButton runButton = new JButton("Run", icon2);
        controls.add(runButton);
        window.add(this.controls, "South");
        Icon icon3 = new ImageIcon("images/reset.png");
        JButton resetButton = new JButton("Reset", icon3);
        controls.add(resetButton);
        window.add(this.controls, "South");
        controls.setBorder(BorderFactory.createLineBorder(Color.black));
        game.setBorder(BorderFactory.createLineBorder(Color.black));
        settings.setPreferredSize(new Dimension(150, 150));
        game.setPreferredSize(new Dimension(660, 200));
        JLabel blank = new JLabel("                                                           Speed:");
        controls.add(blank);
        JSlider slider = new JSlider();
        slider.setMajorTickSpacing(15);
        slider.setPaintTicks(true);
        controls.add(slider);
    }
    
    @Override
    public void actionPerformed(final ActionEvent e) {
    }
    }