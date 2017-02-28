import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;

public class OS1{

	private JFrame frame;
	private JTextField txtHelloWelcomeTo;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		w CAL= new w(null);
	//	CAL.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OS1 window = new OS1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OS1() {
		initialize();
	}
	ImageIcon sc=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218785637716954.png");
	ImageIcon pr=new  ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218788599862036.png");

	ImageIcon ds=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218786764334565.png");

	ImageIcon dp=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218786957085804.png");


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("HELLO! WELCOME TO OUR SIMULATOR.");
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 760, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnClickToSee = new JButton(sc);
		btnClickToSee.setBackground(Color.BLACK);
		btnClickToSee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] args = {};
				MyNewWindowClass.main(args);

			}
		});
		btnClickToSee.setBounds(188, 11, 344, 69);
		frame.getContentPane().add(btnClickToSee);
		
		JButton btnClickToSee_1 = new JButton(pr);
		btnClickToSee_1.setBackground(Color.BLACK);
		btnClickToSee_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			//	String[] args = {};
				//String[] args = {};
			//	MyNewWindowClass6.main(args);
				MyNewWindowClass6 newWindow= new MyNewWindowClass6();
				newWindow.setVisible(true);

				
				
			}
		});
		btnClickToSee_1.setBounds(188, 266, 344, 66);
		frame.getContentPane().add(btnClickToSee_1);
		
		JButton btnClickToSee_2 = new JButton(ds);
		btnClickToSee_2.setBackground(Color.BLACK);
		btnClickToSee_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyNewWindowClass5 newWindow= new MyNewWindowClass5();
				newWindow.setVisible(true);

				
			}
		});
		btnClickToSee_2.setBounds(188, 141, 344, 69);
		frame.getContentPane().add(btnClickToSee_2);
		
		JButton btnDiningPhilosophers = new JButton(dp);
		btnDiningPhilosophers.setBackground(Color.BLACK);
		btnDiningPhilosophers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//MyNewWindowClass8 newWindow= new MyNewWindowClass8();
				//newWindow.setVisible(true);
				//MyNewWindowClass8.main(String[0] args);
				String[] args = {};
				MyNewWindowClass8.main(args);
			}
		});
		btnDiningPhilosophers.setBounds(188, 388, 344, 66);
		frame.getContentPane().add(btnDiningPhilosophers);
		
	}
}
