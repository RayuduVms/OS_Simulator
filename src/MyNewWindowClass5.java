import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyNewWindowClass5 extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MyNewWindowClass dialog = new MyNewWindowClass();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	ImageIcon fcfs=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791014163904.png");
	ImageIcon sstf=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791065234259.png");
	ImageIcon scan=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791121729434.png");
	ImageIcon cscan=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791360710353.png");
	//ImageIcon look=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791222316229.png");
	ImageIcon Clook=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791290256450.png");

	ImageIcon graph=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218791420507690.png");

	/**
	 * Create the dialog.
	 */
	public MyNewWindowClass5() {
		setTitle("Disk Scheduling");
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 556, 404);
		getContentPane().setLayout(null);
		
		JButton btnFcfs = new JButton(fcfs);
		btnFcfs.setBackground(Color.BLACK);
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				MyNewWindowClass1 newWindow = new MyNewWindowClass1();
//				newWindow.setVisible(true);
				String[] args = {};
				dfcfs.main(args);

			}
		});
		btnFcfs.setBounds(10, 114, 148, 65);
		getContentPane().add(btnFcfs);
		
		JButton btnSjf = new JButton(sstf);
		btnSjf.setBackground(Color.BLACK);
		btnSjf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = {};
				dsstf.main(args);

				
			}
		});
		btnSjf.setBounds(369, 114, 154, 65);
		getContentPane().add(btnSjf);
		
		JButton btnSrtf = new JButton(scan);
		btnSrtf.setBackground(Color.BLACK);
		btnSrtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = {};
				dscan.main(args);

			}
		});
		btnSrtf.setBounds(180, 188, 175, 65);
		getContentPane().add(btnSrtf);
		
		JButton btnRr = new JButton(cscan);
		btnRr.setBackground(Color.BLACK);
		btnRr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = {};
				dcscan.main(args);

			}
		});
		btnRr.setBounds(369, 278, 154, 65);
		getContentPane().add(btnRr);
		
		JButton btnNewButton = new JButton(Clook);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] args = {};
				clook.main(args);

			}
		});
		btnNewButton.setBounds(10, 278, 148, 65);
		getContentPane().add(btnNewButton);
		
		JButton btnGraphs = new JButton(graph);
		btnGraphs.setBackground(Color.BLACK);
		btnGraphs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n,i,hd,flag,total=0;
				Random r = new Random();
		     //   Scanner scan=new Scanner(System.in);
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
		                   
		
		 	int j,sum=0,min,loc,x=0,y,disk;
	   //  Scanner scan=new Scanner(System.in);
	    // System.out.println("Enter no of cylinders:");
	  //   n=scan.nextInt();
	    // int[][] arr=new int [100][2];
	     //int arr[][] = null;
	     int[] ar=new int [100];
	     int[] a=new int [100];
	     //int disk,a[] = null,ar[] = null;
	     
	     
	    // System.out.println("Enter header:");
	  //   disk=scan.nextInt();
	     System.out.println("Enter the cylinder no:");
	     for(i=0;i<n;i++)
	     {
	        // arr[i][0]=scan.nextInt();
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
	                     ar[j]=hd-arr[j][0];
	                     if(ar[j]<0)
	                     {
	                         ar[j]=arr[j][0]-hd;
	                     }
	                     min=ar[j];
	                     loc=j;
	                     x++;
	                 }
	                 else
	                 {
	                     ar[j]=hd-arr[j][0];
	                     if(ar[j]<0)
	                     {
	                         ar[j]=arr[j][0]-hd;
	                         
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
	             a[i]=arr[loc][0]-hd;
	             if(a[i]<0)
	             {
	                 a[i]=hd-arr[loc][0];
	                 
	             }
	             disk=arr[loc][0];
	         }
	        
	         for(i=0;i<n;i++)
	         {
	           //  System.out.println(arr[i][0]);
	             sum=sum+a[i];
	         }
	         System.out.println("The total no of cylinders traversed during disk sceduling is:" + sum);
	         
	         
	       //  int i,n,j;
	         int temp,t = 0;
	       //  int[] a=new int [100];
	         int[] b=new int [100];
	        // Scanner scan= new Scanner(System.in);
	        // System.out.println("Enter header:");
	         a[0]=hd;
	         int s = a[0];
	         System.out.println("Enter min track limit:");
	         int p=0;
	         System.out.println("Enter max track limit:");
	         int m=199;
	      //   System.out.println("Enter no of cylinders:");
	        // n=scan.nextInt();
	         System.out.println("Enter the cylinder no:");
	         for(i=1;i<=n;i++)
	         {
	             a[i]=c[i-1];
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
	              t+=(a[n+2]-a[x-1]);
	             b[j++]=a[i];
	             for(i=x-1;i>1;i--)
	             {
	                 t+=(a[i]-a[i-1]);
	                 b[j++]=a[i];
	             }
	             b[j++]=a[i];
	         }
	         System.out.println("Order of cylinders:");
	         for(i=0;i<=n+1;i++)
	             System.out.println(b[i]);
	         System.out.println("The total no of cylinders traversed during disk sceduling is:" + t);
	         
	         
	        x = 0;
	        int t1 = 0;
	        a[0]=hd;
	         s = a[0];
	        System.out.println("Enter the cylinder no:");
	        for(i=1;i<=n;i++)
	        {
	            a[i]=c[i-1];
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
	                t1+=(a[i]-a[i-1]);
	                b[j++]=a[i];
	            }
	            t1+=(a[x+1]-a[0]);
	            b[j++]=a[0];
	            for(i=x+1;i<n+1;i++)
	            {
	                t1+=(a[i+1]-a[i]);
	                b[j++]=a[i];
	            }
	            b[j++]=a[i];
	            
	        }
	        else
	        {
	            for(i=x;i<n+2;i++)
	            {
	                t1+=(a[i+1]-a[i]);
	                b[j++]=a[i];
	            }
	             t1+=(a[n+2]-p);
	            b[j++]=a[i];
	            t1+=(a[1]-p);
	            b[j++]=p;
	            for(i=1;i<x-1;i++)
	            {
	                t1+=(a[i+1]-a[i]);
	                b[j++]=a[i];
	            }
	            b[j++]=a[i];
	        }
	        System.out.println("Order of cylinders:");
	        for(i=0;i<=n+2;i++)
	            System.out.println(b[i]);
	        System.out.println("The total no of cylinders traversed during disk sceduling is:" + t1);
	        
	        
	  //      Scanner scan=new Scanner(System.in);
	        int k=0,d=1,hm=0,head;
	        int[] brr = new int[100];
	        
	     //   System.out.println("Enter no of cylinders:");
	     //   n=scan.nextInt();
	   //     System.out.println("Enter header:");
	       int br=hd;
	        System.out.println("Enter the cylinder no:");
	        for(i=0;i<n;i++)
	        {
	            brr[i]=c[i];
	        }
	        brr[i]=br;
	        for(i=0;i<=n-1;i++)
	        {
	            for(j=0;j<=n-1-i;j++)
	            {
	                if(brr[j]>brr[j+1])
	                {
	                    temp=brr[j];
	                    brr[j]=brr[j+1];
	                    brr[j+1]=temp;
	                }
	            }
	        }
	        for(i=0;i<n;i++)
	        {
	            if(brr[i]==br)
	            {
	                k=i;
	                
	            }
	        }
	        for(i=k;i<n;i++)
	        {
	            head=brr[i]-brr[i+1];
	            if(head<0)
	            {
	                head=head*(-1);
	                
	            }
	            System.out.println(arr[i]);
	            hm=hm+head;
	        }
	        head=brr[i]-brr[0];
	        hm=hm+head;
	        System.out.println(brr[i]);
	        for(i=0;i<k-1;i++)
	        {
	            head=brr[i]-brr[i+1];
	            if(head<0)
	            {
	                head=head*(-1);
	                
	            }
	           
	            hm=hm+head;
	            System.out.println(brr[i]);
	            System.out.println(brr[i+1]);
	        }
	       System.out.println("The total no of cylinders traversed during disk sceduling is:" + hm);
	       
	       	w1 obj = new w1(null);
	       	obj.createAndShowGui(total, sum, t, t1,hm);
			}
		});
		btnGraphs.setBounds(184, 26, 171, 60);
		getContentPane().add(btnGraphs);
	

	}
}
