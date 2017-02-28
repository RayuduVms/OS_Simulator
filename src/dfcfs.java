import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class dfcfs {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dfcfs window = new dfcfs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ImageIcon fcfs=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791014163904.png");

	/**
	 * Create the application.
	 */
	public dfcfs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnFcfs = new JButton(fcfs);
		btnFcfs.setBackground(Color.BLACK);
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n,i,hd,flag,total=0;
		    //    Scanner scan=new Scanner(System.in);
				Random r = new Random();
		        System.out.println("Enter no of cylinders:");
		        n=r.nextInt(10)+1;
		        int c[]=new int[n];
		        int h[]=new int[n];
		        int arr[][]=new int[n][n];
		        System.out.println("Enter the cylinder no:");
		        for(i=0;i<n;i++)
		        {
		            c[i]=r.nextInt(199)+1;
		            arr[i][0]=c[i];
		        }
		        System.out.println("Enter header:");
		        hd=r.nextInt(100)+1;
		        flag=hd;
		        for(i=0;i<n;i++)
		        {
		            if(c[i]> flag)
		            {
		                h[i]=c[i]-flag;
		            }
		            else
		            {
		                h[i]=flag-c[i];
		            }
		                flag=c[i];
		            
		        }
		        for(i=0;i<n;i++)
		        {
		            total=total+h[i];
		        }
		            System.out.println("The total no of cylinders traversed during disk sceduling is:" + total);
		            textField.setText(String.valueOf(total));
		                   
			}
		});
		btnFcfs.setBounds(86, 42, 235, 57);
		frame.getContentPane().add(btnFcfs);
		
		textField = new JTextField();
		textField.setBounds(159, 140, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
