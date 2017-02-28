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

public class dsstf {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dsstf window = new dsstf();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	ImageIcon sstf=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791065234259.png");


	/**
	 * Create the application.
	 */
	public dsstf() {
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
		
		JButton btnSstf = new JButton(sstf);
		btnSstf.setBackground(Color.BLACK);
		btnSstf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i,j,sum=0,n,min,loc,x,y,disk;
		      //  Scanner scan=new Scanner(System.in);
				Random r= new Random();
		        System.out.println("Enter no of cylinders:");
		        n=r.nextInt(10)+1;
		        int[][] arr=new int [100][2];
		        //int arr[][] = null;
		        int[] ar=new int [100];
		        int[] a=new int [100];
		        //int disk,a[] = null,ar[] = null;
		        
		        
		        System.out.println("Enter header:");
		        disk=r.nextInt(100)+1;
		        System.out.println("Enter the cylinder no:");
		        for(i=0;i<n;i++)
		        {
		            arr[i][0]=r.nextInt(199)+1;
		            arr[i][1]=0;
		        }
		        System.out.println("order of cylinders:");
		        for(i=0;i<n;i++)
		        {
		            x=0;
		            min=0;
		            loc=0;
		            for(j=0;j<n;j++)
		            {
		                if(arr[j][1]==0)
		                {
		                    if(x==0)
		                    {
		                        ar[j]=disk-arr[j][0];
		                        if(ar[j]<0)
		                        {
		                            ar[j]=arr[j][0]-disk;
		                        }
		                        min=ar[j];
		                        loc=j;
		                        x++;
		                    }
		                    else
		                    {
		                        ar[j]=disk-arr[j][0];
		                        if(ar[j]<0)
		                        {
		                            ar[j]=arr[j][0]-disk;
		                            
		                        }
		                    }
		                    if(min>ar[j])
		                    {
		                        min=ar[j];
		                        loc=j;
		                    }
		                    }
		            }
		                arr[loc][1]=1;
		                System.out.println(arr[loc][0]);
		                a[i]=arr[loc][0]-disk;
		                if(a[i]<0)
		                {
		                    a[i]=disk-arr[loc][0];
		                    
		                }
		                disk=arr[loc][0];
		            }
		           
		            for(i=0;i<n;i++)
		            {
		              //  System.out.println(arr[i][0]);
		                sum=sum+a[i];
		            }
		            System.out.println("The total no of cylinders traversed during disk sceduling is:" + sum);
		            textField.setText(String.valueOf(sum));
			}
		});
		btnSstf.setBounds(99, 60, 210, 49);
		frame.getContentPane().add(btnSstf);
		
		textField = new JTextField();
		textField.setBounds(160, 139, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
