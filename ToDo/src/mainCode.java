import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;
import java.text.SimpleDateFormat;

public class mainCode {
    
    secondFrame frame2 = new secondFrame();
    JFrame mainFrame = new JFrame("To-Do organizer");
    JFrame popUpFrame = new JFrame("ERROR");
    JPanel mainPanel = new JPanel();
    JLabel viewToDoHeader = new JLabel("Todays to-do");
    int activeTasks = 0;
    int completedTasks = 0;
    JLabel viewActiveTasks = new JLabel("Number of tasks: " + activeTasks);
    JLabel viewCompleted = new JLabel("Completed tasks: " + completedTasks);
    Date date = new Date();
    SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM-yy  |  HH:mm");
    String datePattern = dFormat.format(date);
    JLabel viewDate = new JLabel("" + datePattern);
    JButton createTaskBtn = new JButton("New Task");
    JButton markCompletedBtn = new JButton("Mark as completed");
    JButton deleteBtn = new JButton("Delete task");
    DefaultListModel<String> listModel = new DefaultListModel<>();
    JList<String> jList = new JList<>(listModel);
    JScrollPane scrollPane = new JScrollPane(jList);

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
   
    public mainCode(){
      
        createTaskBtn.addActionListener(e ->{
            createTask(frame2.inputTask.getText());
        });
        
        markCompletedBtn.addActionListener(e ->{
            markedAsDone();
        });
        
        deleteBtn.addActionListener(e ->{
            deleteTask();
        });

        frame2.addTaskBtn.addActionListener(e ->{
            addTask(frame2.inputTask.getText(), frame2.inputTime.getText());
        });

        mainPanel.setLayout(new BorderLayout());
        
        jList.setFont(new Font("Georgia", Font.PLAIN, 17));
        jList.setFixedCellHeight(50);
        jList.setFixedCellWidth(100);
        jList.setBorder(new EmptyBorder(10,10, 10, 10));
        //jList.setBackground(Color.getHSBColor( 300,350,700));

        panel1.setLayout(new BorderLayout(20,20));
        mainFrame.add(panel1,BorderLayout.NORTH);

        panel1.setBackground(Color.getHSBColor( 10,1000,700));
        panel1.setPreferredSize(new Dimension(600, 80));

        panel2.setBackground(Color.getHSBColor( 10,1000,700));
        panel2.setPreferredSize(new Dimension(600, 60));
        mainFrame.add(panel2,BorderLayout.SOUTH);

        panel3.setBackground(Color.getHSBColor( 10,1000,700));
        panel3.setPreferredSize(new Dimension(10, 35));
        panel1.add(panel3, BorderLayout.NORTH);

        panel4.setBackground(Color.getHSBColor( 10,1000,700));
        panel4.setPreferredSize(new Dimension(122, 35));
        panel1.add(panel4, BorderLayout.WEST);

        panel5.setBackground(Color.getHSBColor( 10,1000,700));
        panel5.setPreferredSize(new Dimension(122, 50));
        panel1.add(panel5, BorderLayout.EAST);

        panel6.setLayout(new BorderLayout());
        panel6.setBackground(Color.getHSBColor( 10,1000,700));
        panel6.setPreferredSize(new Dimension(50, 100));
        panel1.add(panel6, BorderLayout.CENTER);
        scrollPane.setPreferredSize(new Dimension(600, 600));
        mainFrame.add(scrollPane, BorderLayout.WEST);
        
        viewToDoHeader.setFont(new Font("Georgia", Font.PLAIN, 20));
        viewToDoHeader.setPreferredSize(new Dimension(200, 150));
        viewToDoHeader.setForeground(Color.WHITE);
        panel6.add(viewToDoHeader, BorderLayout.CENTER);
  
        viewDate.setForeground(Color.WHITE);
        viewDate.setFont(new Font("Georgia", Font.PLAIN, 15));
        viewDate.setPreferredSize(new Dimension(125, 150));
        panel6.add(viewDate, BorderLayout.EAST);

        viewActiveTasks.setForeground(Color.WHITE);
        viewActiveTasks.setFont(new Font("Georgia", Font.BOLD, 10));
        viewActiveTasks.setPreferredSize(new Dimension(120, 18));
        panel4.add(viewActiveTasks, BorderLayout.CENTER);
        
        viewCompleted.setForeground(Color.WHITE);
        viewCompleted.setFont(new Font("Georgia", Font.BOLD, 10));
        viewCompleted.setPreferredSize(new Dimension(120, 18));
        panel5.add(viewCompleted, BorderLayout.CENTER);

        createTaskBtn.setPreferredSize(new Dimension(90,20));
        panel3.add(createTaskBtn, BorderLayout.SOUTH);

        markCompletedBtn.setPreferredSize(new Dimension(145,50));
        panel2.add(markCompletedBtn, BorderLayout. WEST);
        
        deleteBtn.setPreferredSize(new Dimension(145,50));
        panel2.add(deleteBtn, BorderLayout.EAST);

        mainFrame.setSize(600,800);
        mainFrame.setResizable(false);
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);  
    }

    public void createTask(String insert){

        frame2.secondPanel.setLayout(new GridLayout(3, 1));
        frame2.secondPanel.setBackground(Color.getHSBColor( 10,1000,700));
    
        
        frame2.secondPanel.add(frame2.taskLabel);
        frame2.secondPanel.add(frame2.inputTask);
        frame2.secondPanel.add(frame2.timeLabel);
        frame2.secondPanel.add(frame2.inputTime);
        frame2.secondPanel.add(frame2.addTaskBtn);
        frame2.secondPanel.add(frame2.timeExample);

        frame2.taskLabel.setFont(new Font("Georgia", Font.PLAIN, 17));
        frame2.taskLabel.setForeground(Color.WHITE);
        frame2.timeLabel.setFont(new Font("Georgia", Font.PLAIN, 17));
        frame2.timeLabel.setForeground(Color.WHITE);
        frame2.timeExample.setFont(new Font("Georgia", Font.PLAIN, 17 ));
        frame2.timeExample.setForeground((Color.WHITE));
        
        frame2.secondFrame.setSize(500,150);
        frame2.secondFrame.setResizable(false);
        frame2.secondFrame.add(frame2.secondPanel);
        frame2.secondFrame.setLocationRelativeTo(null);
        frame2.secondFrame.setVisible(true);
    }
    
    public void markedAsDone(){

        int index = jList.getSelectedIndex();
        if (index >= 0){
            String item = listModel.getElementAt(index);
            listModel.setElementAt("<html><strike>" + item + "</strike><html>", index);
            //jList.setSelectionBackground(Color.GREEN);

            completeTask();
        }
    }
    
    public void deleteTask(){

        int index = jList.getSelectedIndex();
        if (index >= 0){
            listModel.remove(index);

            deletedTask();
            //completeTask();
        }
    }

    public void addTask(String insert, String insertkl) {
        if (insert.isBlank() || insertkl.isBlank()) {
            JOptionPane.showMessageDialog(popUpFrame, "You are trying to add a task with one of the text fields empty. Try again.", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (!insertkl.matches("[0-9:]+")) {
                JOptionPane.showMessageDialog(popUpFrame, "Please write a correct time input like shown in the example.", "ERROR!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                listModel.addElement(" " + insertkl + "  -  " + insert);
                frame2.inputTask.setText("");
                frame2.inputTime.setText("");
                frame2.secondFrame.setVisible(false);
                activeTask();
            }
        }
    }

    public void deletedTask(){

        activeTasks--;
        viewActiveTasks.setText("Number of tasks: " + activeTasks);
    }

    public void activeTask(){

        activeTasks++;
        viewActiveTasks.setText("Number of tasks: " + activeTasks);
    }

    public void completeTask(){

        completedTasks++;
        viewCompleted.setText("Completed tasks: " + completedTasks);
    }

    public static void main(String[] args) {
        new mainCode();
    }
}