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

public class dcscan {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dcscan window = new dcscan();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ImageIcon cscan=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791360710353.png");

	/**
	 * Create the application.
	 */
	public dcscan() {
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
		
		JButton btnCscan = new JButton(cscan);
		btnCscan.setBackground(Color.BLACK);
		btnCscan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int i,n,j;
			       int temp,x = 0,t = 0;
			       int[] a=new int [100];
			       int[] b=new int [100];
		//	       Scanner scan= new Scanner(System.in);
			       Random r = new Random();
			       System.out.println("Enter header:");
			       a[0]=r.nextInt(100)+1;
			       int s = a[0];
			       System.out.println("Enter min track limit:");
			       int p=0;
			       System.out.println("Enter max track limit:");
			       int m=199;
			       System.out.println("Enter no of cylinders:");
			       n=r.nextInt(10)+1;
			       System.out.println("Enter the cylinder no:");
			       for(i=1;i<=n;i++)
			       {
			           a[i]=r.nextInt(199)+1;
			       }
			       a[n+1]=m;
			       a[n+2]=0;
			       
			       for(i=n+1;i>=0;i--)
			       {
			           for(j=0;j<=i;j++)
			           {
			               if(a[j] > a[j+1])
			               {
			                   temp=a[j];
			                   a[j]=a[j+1];
			                   a[j+1]=temp;
			               }
			           }
			       }
			       for(i=1;i<=n;i++)
			       {
			           if(s==a[i])
			               x=i;
			           
			       }
			       j=0;
			       if(s<p)
			       {
			           for(i= x ;i>0;i--)
			           {
			               t+=(a[i]-a[i-1]);
			               b[j++]=a[i];
			           }
			           t+=(a[x+1]-a[0]);
			           b[j++]=a[0];
			           for(i=x+1;i<n+1;i++)
			           {
			               t+=(a[i+1]-a[i]);
			               b[j++]=a[i];
			           }
			           b[j++]=a[i];
			           
			       }
			       else
			       {
			           for(i=x;i<n+2;i++)
			           {
			               t+=(a[i+1]-a[i]);
			               b[j++]=a[i];
			           }
			            t+=(a[n+2]-p);
			           b[j++]=a[i];
			           t+=(a[1]-p);
			           b[j++]=p;
			           for(i=1;i<x-1;i++)
			           {
			               t+=(a[i+1]-a[i]);
			               b[j++]=a[i];
			           }
			           b[j++]=a[i];
			       }
			       System.out.println("Order of cylinders:");
			       for(i=0;i<=n+2;i++)
			           System.out.println(b[i]);
			       System.out.println("The total no of cylinders traversed during disk sceduling is:" + t);
			       textField.setText(String.valueOf(t));
			}
		});
		btnCscan.setBounds(65, 59, 288, 49);
		frame.getContentPane().add(btnCscan);
		
		textField = new JTextField();
		textField.setBounds(153, 147, 94, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
