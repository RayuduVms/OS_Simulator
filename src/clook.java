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

public class clook {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clook window = new clook();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ImageIcon Clook=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791290256450.png");


	/**
	 * Create the application.
	 */
	public clook() {
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
		
		JButton btnClook = new JButton(Clook);
		btnClook.setBackground(Color.BLACK);
		btnClook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		        //Scanner scan=new Scanner(System.in);
				Random r = new Random();
		        int n,b,c,k=0,d=1,i,hm=0,head,temp;
		        int[] arr = new int[100];
		        System.out.println("Enter no of cylinders:");
		        n=r.nextInt(10)+1;
		        System.out.println("Enter header:");
		        b=r.nextInt(100)+1;
		        System.out.println("Enter the cylinder no:");
		        for(c=0;c<n;c++)
		        {
		            arr[c]=r.nextInt(199)+1;
		        }
		        arr[c]=b;
		        for(c=0;c<=n-1;c++)
		        {
		            for(i=0;i<=n-1-c;i++)
		            {
		                if(arr[i]>arr[i+1])
		                {
		                    temp=arr[i];
		                    arr[i]=arr[i+1];
		                    arr[i+1]=temp;
		                }
		            }
		        }
		        for(c=0;c<n;c++)
		        {
		            if(arr[c]==b)
		            {
		                k=c;
		                
		            }
		        }
		        for(c=k;c<n;c++)
		        {
		            head=arr[c]-arr[c+1];
		            if(head<0)
		            {
		                head=head*(-1);
		                
		            }
		            System.out.println(arr[c]);
		            hm=hm+head;
		        }
		        head=arr[c]-arr[0];
		        hm=hm+head;
		        System.out.println(arr[c]);
		        for(c=0;c<k-1;c++)
		        {
		            head=arr[c]-arr[c+1];
		            if(head<0)
		            {
		                head=head*(-1);
		                
		            }
		           
		            hm=hm+head;
		            System.out.println(arr[c]);
		            System.out.println(arr[c+1]);
		        }
		       System.out.println("The total no of cylinders traversed during disk sceduling is:" + hm);
		       textField.setText(String.valueOf(hm));
			}
		});
		btnClook.setBounds(87, 77, 266, 46);
		frame.getContentPane().add(btnClook);
		
		textField = new JTextField();
		textField.setBounds(163, 161, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
