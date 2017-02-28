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

public class MyNewWindowClass2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MyNewWindowClass2 dialog = new MyNewWindowClass2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	ImageIcon sjf=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218789905969404.png");


	/**
	 * Create the dialog.
	 */
	public MyNewWindowClass2() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.BLACK);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAwerageWaitingTime = new JButton(sjf);
			btnAwerageWaitingTime.setBackground(Color.BLACK);
			btnAwerageWaitingTime.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 Random r=new Random();
				        int vinni;
				        vinni=r.nextInt(5)+1;
				        int tasks[]=new int[vinni];
				        int a[]=new int[vinni];
				        int b[]=new int[vinni];
				        int waiting[]=new int[vinni];
				        int index=0;
				        int t[]=new int[vinni];
				        while(index<vinni)
				        {
				        /**    Scanner v=new Scanner(System.in);
				            int i;
				                    i=v.nextInt();
				                    tasks[index]=i;*/
				        tasks[index]=r.nextInt(100)+1;
				        index++;
				        }
				         for(int i=0;i<vinni;i++)
				        {
					System.out.println("burst time of job"+ i+" "+tasks[i]);
					}
				        int numberoftasks=vinni;
				        System.out.println(vinni +" tasks created");
				        int waitingTime=0;
				        int time=0,sum=0;
				        int i,j;
				        for(i=0;i<numberoftasks;i++)
				        {
				        a[i]=tasks[i];
				        }
				        a[0]=tasks[0];
				        for(i=1;i<numberoftasks;i++)
				        {
				        for(j=i;j<numberoftasks-1;j++)
				        {
				        if(a[j]>a[j+1])
				        {
				        int temp;
				        temp=a[j];
				        a[j]=a[j+1];
				        a[j+1]=temp;
				        }
				        }
				        }
				        for(i=0;i<numberoftasks;i++)
				        {
				            sum=sum+a[i];
				            waiting[i]=sum;
				         //   System.out.println(waiting[i]+"**\n");
				        }
				        t[0]=waiting[0];
				        for(i=1;i<numberoftasks;i++)
				        {
				        for(j=1;j<numberoftasks;j++)
				        {
				        if(tasks[i]==a[j])
				        {
				        t[i]=waiting[j];
				        //System.out.println(t[i]+"* ");
				        }
				        }
				        }
				       
				        for(i=0;i<numberoftasks;i++)
				        {
				        time=time+(t[i]-tasks[i]-i);
				        }
				        System.out.println("waiting time is "+time);
				        System.out.println("Average waiting time is "+(1.0*time/numberoftasks));
				        double AWT=1.0*time/numberoftasks;
					    textField.setText(String.valueOf(AWT));

				}
			});
			btnAwerageWaitingTime.setBounds(106, 75, 220, 57);
			contentPanel.add(btnAwerageWaitingTime);
		}
		{
			textField = new JTextField();
			textField.setBounds(166, 158, 110, 20);
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
