import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class MyNewWindowClass1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MyNewWindowClass1 dialog = new MyNewWindowClass1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	ImageIcon fcfs=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218789546749615.png");

	/**
	 * Create the dialog.
	 */
	public MyNewWindowClass1() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAwergeWaitingTime = new JButton(fcfs);
			btnAwergeWaitingTime.setBackground(Color.BLACK);
			btnAwergeWaitingTime.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Random r=new Random();
			        int balla=r.nextInt(5)+1;
			        int index=0;
			        int tasks[]=new int[balla];
			        while(index<balla)
			        {
			        tasks[index]=r.nextInt(100)+1;
			        index++;
			        }
			        for(int i=0;i<balla;i++)
			        {
				System.out.println("burst time of job"+ i+" "+tasks[i]);
				}
			        int numberoftasks=balla;
			        System.out.println(numberoftasks +" tasks created\n");
			        int waitingTime=0;
			        int time=0;
			        int i;
			        for(i=0;i<numberoftasks;i++)
			        {
			        time+=tasks[i];
			        waitingTime=waitingTime+(time-tasks[i]-i);
			        }
			        System.out.println("waiting Time is "+waitingTime);		
			        double AWT=1.0*waitingTime/numberoftasks;
			        System.out.println("Average waiting time is =" +(AWT));
			        textField.setText(String.valueOf(AWT));

				}
			});
			btnAwergeWaitingTime.setBounds(111, 71, 208, 57);
			contentPanel.add(btnAwergeWaitingTime);
		}
		
		textField = new JTextField();
		textField.setBounds(173, 153, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
