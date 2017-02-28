import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OPTIMAL {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OPTIMAL window = new OPTIMAL();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
ImageIcon optimal = new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218793057931450.png");
	/**
	 * Create the application.
	 */
	public OPTIMAL() {
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
		
		JButton btnOptimal = new JButton(optimal);
		btnOptimal.setBackground(Color.BLACK);
		btnOptimal.addActionListener(new ActionListener()
		{
			public int sort(int c[]) {
				int max = -1;
				int temp = -1;
				for (int k = 0; k < 3; k++) {
					if (c[k] > max) {
						max = c[k];
						temp = k;
					}
				}
				return temp;
			}

			public void actionPerformed(ActionEvent e) {
				   int z,
					m = 0,
					faults = 0;
			        int j,hit=0;
			        Random r = new Random();
//					InputStreamReader isr = new InputStreamReader(System. in );
//					BufferedReader br = new BufferedReader(isr);
//					System.out.println("enter the size of the array");
					int n = r.nextInt(10)+1;
					int a[] = new int[n];
					int flag[] = new int[n];
					System.out.println("enter the elements");
					for (int i = 0; i < n; i++) {
						a[i] = r.nextInt(10)+1;
						flag[i] = 0;
					}
					int b[] = new int[3];
					int c[] = new int[3];
					for (int i = 0; i < 3; i++) {
						b[i] = -1;
						c[i] = 0;
					}
					for (int i = 0; i < n; i++) {
						z = a[i];
						for ( j = 0; j < 3; j++) {
							if (z == b[j]) {
								flag[i] = 1;
								hit = hit + 1;
								break;
							}
						}
						if (flag[i] == 0 && b[2] == -1) {
							for ( j = 0; j < 3; j++) {
								if (b[j] == -1) {
									b[j] = z;
									faults = faults + 1;
									flag[i] = 1;
									break;
								}
							}
						}
						if (flag[i] == 0) {
							m = sort(c);
							b[m] = z;
							faults = faults + 1;
							flag[i] = 1;
							for (int k = 0; k < 3; k++)
							c[k] = c[k] + 1;
							c[m] = 0;
						}
					}
//					System.out.println("no of hits" + hit);
					System.out.println("no of faults" + faults);
				       textField.setText(String.valueOf(faults));


			}
		});
		btnOptimal.setBounds(98, 63, 246, 43);
		frame.getContentPane().add(btnOptimal);
		
		textField = new JTextField();
		textField.setBounds(159, 117, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
