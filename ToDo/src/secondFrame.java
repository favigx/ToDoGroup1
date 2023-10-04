import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class secondFrame {
    JPanel secondPanel = new JPanel();
    JFrame secondFrame = new JFrame("Skapa");
    JButton addTaskBtn = new JButton("Add to to-do list");
    JTextField inputTask = new JTextField();
    JTextField inputTime = new JTextField();
    JLabel taskLabel = new JLabel("Task");
    JLabel timeLabel= new JLabel("Time");
}