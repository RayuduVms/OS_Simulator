import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MyNewWindowClass4 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	ImageIcon rr=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218790028334125.png");

	public static void main(String[] args) {
		try {
			MyNewWindowClass4 dialog = new MyNewWindowClass4();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MyNewWindowClass4() {
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAwerageWaitingTime = new JButton(rr);
			btnAwerageWaitingTime.setBackground(Color.BLACK);
			btnAwerageWaitingTime.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Random r = new Random();
					  int i,j,k,q,sum=0;
					  System.out.println("Enter number of process:");
					  int n=r.nextInt(5)+1;
					  int bt[]=new int[n];
					  int wt[]=new int[n];
					  int tat[]=new int[n];
					  int a[]=new int[n];
					  System.out.println("Enter brust Time:");
					  for(i=0;i<n;i++)
					  {
					  System.out.println("Enter brust Time for "+(i+1));
					  bt[i]=r.nextInt(50)+1;
					  }
					  System.out.println("Enter Time quantum:");
					  q=r.nextInt(5)+1;
					  System.out.println(q);
					  for(i=0;i<n;i++)
					  a[i]=bt[i];
					  for(i=0;i<n;i++)
					  wt[i]=0;
					  do
					  {
					  for(i=0;i<n;i++)
					  {
					  if(bt[i]>q)
					  {
					  bt[i]-=q;
					  for(j=0;j<n;j++)
					  {
					  if((j!=i)&&(bt[j]!=0))
					  wt[j]+=q;
					  }
					  }
					  else
					  {
					  for(j=0;j<n;j++)
					  {
					  if((j!=i)&&(bt[j]!=0))
					  wt[j]+=bt[i];
					  }
					  bt[i]=0;
					  }
					  }
					  sum=0;
					  for(k=0;k<n;k++)
					  sum=sum+bt[k];
					  }
					  while(sum!=0);
					  for(i=0;i<n;i++)
					  tat[i]=wt[i]+a[i];
					  System.out.println("process\t\tBT\tWT\tTAT");
					  for(i=0;i<n;i++)
					  {
					  System.out.println("process"+(i+1)+"\t"+a[i]+"\t"+wt[i]+"\t"+tat[i]);
					  }
					  int summation=0;
					  for(i=0;i<n;i++)
					  {
					  summation=summation+wt[i];
					  }
					  System.out.println("Average waiting time is "+summation);
					  float avg_wt=0;
					  float avg_tat=0;
					  for(j=0;j<n;j++)
					  {
					  avg_wt+=wt[j];
					  }
					  for(j=0;j<n;j++)
					  {
					  avg_tat+=tat[j];
					  }
					  System.out.println("average waiting time "+(avg_wt/n)+"\n Average turn around time"+(avg_tat/n));
				      textField.setText(String.valueOf(1.0*avg_wt/n));

				}
			});
			btnAwerageWaitingTime.setBounds(116, 54, 219, 63);
			contentPanel.add(btnAwerageWaitingTime);
		}
		{
			textField = new JTextField();
			textField.setBounds(174, 140, 103, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
