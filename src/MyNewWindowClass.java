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

public class MyNewWindowClass extends JDialog {

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

	/**
	 * Create the dialog.
	 
	 */
	ImageIcon fcfs=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218789546749615.png");
	ImageIcon sjf=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218789905969404.png");
	ImageIcon srtf=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218789965085611.png");
	ImageIcon rr=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218790028334125.png");
	ImageIcon graph=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218790235667848.png");


	public MyNewWindowClass() {
		setTitle("Scheduling Algorithms\r\n");
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 587, 467);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(154, 56, 130, 14);
		getContentPane().add(label);
		
		JButton btnFcfs = new JButton(fcfs);
		btnFcfs.setBackground(Color.BLACK);
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyNewWindowClass1 newWindow = new MyNewWindowClass1();
				newWindow.setVisible(true);
			}
		});
		btnFcfs.setBounds(29, 33, 130, 57);
		getContentPane().add(btnFcfs);
		
		JButton btnSjf = new JButton(sjf);
		btnSjf.setBackground(Color.BLACK);
		btnSjf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyNewWindowClass2 newWindow = new MyNewWindowClass2();
				newWindow.setVisible(true);
				
			}
		});
		btnSjf.setBounds(415, 33, 130, 57);
		getContentPane().add(btnSjf);
		
		JButton btnSrtf = new JButton(srtf);
		btnSrtf.setBackground(Color.BLACK);
		btnSrtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyNewWindowClass3 newWindow = new MyNewWindowClass3();
				newWindow.setVisible(true);
			}
		});
		btnSrtf.setBounds(29, 338, 130, 57);
		getContentPane().add(btnSrtf);
		
		JButton btnRr = new JButton(rr);
		btnRr.setBackground(Color.BLACK);
		btnRr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyNewWindowClass4 newWindow = new MyNewWindowClass4();
				newWindow.setVisible(true);
			}
		});
		btnRr.setBounds(415, 338, 130, 57);
		getContentPane().add(btnRr);
		
		JButton btnGraph = new JButton(graph);
		btnGraph.setBackground(Color.BLACK);
		btnGraph.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n,avwt=0,avtat=0,i,j;
				 System.out.println("Enter total number of processes(maximum 20):");
//				 Scanner sc=new Scanner(System.in);
				 Random r = new Random();
				 int balla =r.nextInt(20)+1;
				 int vinni=balla;
				 int bt[] = new int[10];
				 int wt[] = new int[10];
				 int tat[] = new int[10];
				 int fc[] = new int[10];
				 System.out.println("\nEnter Process Burst Time\n");
				 for(i=0;i<balla;i++)
				   {
				        System.out.println("P[%d]:"+i+1);
				        bt[i]=r.nextInt(100)+1;
				        fc[i]=bt[i];
				   }
				  wt[0]=0;   
				  for(i=1;i<balla;i++)
				   {
				       wt[i]=0;
				       for(j=0;j<i;j++)
				           wt[i]+=bt[j];
				   }
				  for(i=0;i<balla;i++)
				    {
				        tat[i]=bt[i]+wt[i];
				        avwt+=wt[i];
				        avtat+=tat[i];
				    }
				 
				    avwt/=i;
				    avtat/=i;
				    System.out.println(avwt+"\n");
				    System.out.println(avtat);
				    
				    int total=0,pos,temp;
				    int p[]=new int[10];
				    float avg_wt,avg_tat;
				    for(i=0;i<balla;i++)
				    {
				        p[i]=i+1;        
				    }
				    for(i=0;i<balla;i++)
				    {
				        pos=i;
				        for(j=i+1;j<balla;j++)
				        {
				            if(bt[j]<bt[pos])
				                pos=j;
				        }
				 
				        temp=bt[i];
				        bt[i]=bt[pos];
				        bt[pos]=temp;
				 
				        temp=p[i];
				        p[i]=p[pos];
				        p[pos]=temp;
				    }
				    wt[0]=0;            
				    for(i=1;i<balla;i++)
				    {
				        wt[i]=0;
				        for(j=0;j<i;j++)
				            wt[i]+=bt[j];
				 
				        total+=wt[i];
				    }
				    avg_wt=(float)total/balla;      
				    total=0;		 
				    for(i=0;i<balla;i++)
				    {
				        tat[i]=bt[i]+wt[i];     
				        total+=tat[i];
				    }		 
				    avg_tat=(float)total/balla;     
				    System.out.println(avg_wt+"\n");
				    System.out.println(avg_tat);		
				    
				    int a[]=new int[balla];
				    int x[] = new int[balla];
				    int smallest,count=0,time;
				    double avg=0,tt=0,end;
				    for(i=0;i<balla;i++)
				        a[i]=i; 
				    for(i=0;i<balla;i++)
				        x[i]=bt[i];
				    bt[9]=9999;		     
				    for(time=0;count!=balla;time++)
				    {
				      smallest=9;
				     for(i=0;i<balla;i++)
				     {
				      if(a[i]<=time && bt[i]<bt[smallest] && bt[i]>0 )
				      smallest=i;
				     }
				     bt[smallest]--;
				     if(bt[smallest]==0)
				     {
				      count++;
				      end=time+1;
				      avg=avg+end-a[smallest]-x[smallest];
				      tt= tt+end-a[smallest];
				     }
				    }
				    double WT=avg/balla;
				    System.out.println(avg/balla);
				    System.out.println("Average Turnaround time"+tt/balla);
				    
				    int remain,flag=0,time_quantum; 
				    int wait_time=0,turnaround_time=0;
				    int at[] = new int[10];
				    int rt[] = new int[10]; 
				    remain=balla; 
				    for(count=0;count<vinni;count++) 
				    {  
				      at[count]=count;  
				      rt[count]=fc[count]; 
				    } 
				    System.out.println("Enter Time Quantum:\t"); 
				    time_quantum=r.nextInt(5)+1;  
				    for(time=0,count=0;remain!=0;) 
				    { 
				      if(rt[count]<=time_quantum && rt[count]>0) 
				      { 
				        time+=rt[count]; 
				        rt[count]=0; 
				        flag=1; 
				      } 
				      else if(rt[count]>0) 
				      { 
				        rt[count]-=time_quantum; 
				        time+=time_quantum; 
				      } 
				      if(rt[count]==0 && flag==1) 
				      { 
				        remain--; 
				        wait_time+=time-at[count]-fc[count]; 
				        turnaround_time+=time-at[count]; 
				        flag=0; 
				      } 
				      if(count==vinni-1) 
				        count=0; 
				      else if(at[count+1]<=time) 
				        count++; 
				      else 
				        count=0; 
				    }
				    double WT1=wait_time*1.0/vinni;
				    System.out.printf("\nAverage Waiting Time= %f\n",wait_time*1.0/vinni); 
				    System.out.printf("Avg Turnaround Time = %f",turnaround_time*1.0/vinni); 
				    w obj=new w(null);
				    obj.createAndShowGui(avwt, avg_wt, WT, WT1);


			}
		});
		btnGraph.setBounds(230, 178, 130, 63);
		getContentPane().add(btnGraph);
	

	}
}
