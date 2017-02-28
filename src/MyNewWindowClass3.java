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

public class MyNewWindowClass3 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MyNewWindowClass3 dialog = new MyNewWindowClass3();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	ImageIcon srtf=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218789965085611.png");

	public MyNewWindowClass3() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAwerageWaitingTime = new JButton(srtf);
			btnAwerageWaitingTime.setBackground(Color.BLACK);
			btnAwerageWaitingTime.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int n;
					   Random r= new Random();
				       n = r.nextInt(5)+1;
				       int proc[][] = new int[n + 1][4];
				       for(int i = 1; i <= n; i++)
				       {
				      proc[i][0] = r.nextInt(50)+1;
				      System.out.println(" Arrival Time for Process " + i + "is: "+proc[i][0]);
				      proc[i][1] = r.nextInt(50)+1;
				      System.out.println("Please enter the Burst Time for Process " + i + ": "+proc[i][1]);
				       }
				     System.out.println();
				     int total_time = 0;
				     for(int i = 1; i <= n; i++)
				     {
				      total_time += proc[i][1];
				     }
				     int time_chart[] = new int[total_time];
				     for(int i = 0; i < total_time; i++)
				     {
				      int sel_proc = 0;
				      int min = 100000;
				      for(int j = 1; j <= n; j++)
				      {
				       if(proc[j][0] <= i)
				    	   
				       {
				        if(proc[j][1] < min && proc[j][1] != 0)
				        {
				         min = proc[j][1];
				         sel_proc = j;
				        }
				       }
				      }
				      time_chart[i] = sel_proc;
				      proc[sel_proc][1]--;
				      for(int j = 1; j <= n; j++)
				      {
				       if(proc[j][0] <= i)
				       {
				        if(proc[j][1] != 0)
				        {
				         proc[j][3]++;
				            if(j != sel_proc)
				             proc[j][2]++;
				        }
				       else if(j == sel_proc)
				       proc[j][3]++;
				       }
				      }
				      if(i != 0)
				      {
				       if(sel_proc != time_chart[i - 1])
				       {
				       System.out.print("--" + i + "--P" + sel_proc);
				       }
				      }
				      else
				       System.out.print(i + "--P" + sel_proc);
				      if(i == total_time - 1)
				       System.out.print("--" + (i + 1));
				     }
				     System.out.println();
				     System.out.println();
				     System.out.println("P\t WT \t TT ");
				     for(int i = 1; i <= n; i++)
				     {
				      System.out.printf("%d\t%2dms\t%2dms",i,proc[i][2],proc[i][3]);
				      System.out.println();
				     }
				     System.out.println();
				     float WT = 0,TT = 0;
				     for(int i = 1; i <= n; i++)
				     {
				      WT += proc[i][2];
				     }
				     WT /= n;
				     System.out.println("The Average WT is: " + WT + "ms");
				     textField.setText(String.valueOf(1.0*WT));

				}
			});
			btnAwerageWaitingTime.setBounds(99, 57, 237, 55);
			contentPanel.add(btnAwerageWaitingTime);
		}
		{
			textField = new JTextField();
			textField.setBounds(154, 136, 118, 20);
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
