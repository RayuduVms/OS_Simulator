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

public class FIFO {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FIFO window = new FIFO();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FIFO() {
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
		ImageIcon fifo=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218792872703163.png");
		JButton btnFifo = new JButton(fifo);
		btnFifo.setBackground(Color.BLACK);
		btnFifo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fifo[] = new int[3];
				int n;
	//			Scanner br = new Scanner(System. in );
				Random r = new Random();
				System.out.println("Enter the number of inputs :");
				n = r.nextInt(10)+1;
				int inp[] = new int[n];
				System.out.println("Enter the inputs:");
				for (int i = 0; i < n; i++)
				inp[i] =r.nextInt(10)+1;
				System.out.println("---------------");
				for (int i = 0; i < 3; i++)
				fifo[i] = -1;
				int Hit = 0;
				int Fault = 0;
				int j = 0;
				boolean check;
				for (int i = 0; i < n; i++) {
					check = false;

					for (int k = 0; k < 3; k++)
					if (fifo[k] == inp[i]) {
						check = true;
						Hit = Hit + 1;
					}
					if (check == false) {
						fifo[j] = inp[i];
						j++;
						if (j >= 3) j = 0;
						Fault = Fault + 1;
					}

				}
				System.out.println( " FAULT;" + Fault);
			       textField.setText(String.valueOf(Fault));

			}
		});
		btnFifo.setBounds(124, 39, 169, 55);
		frame.getContentPane().add(btnFifo);
		
		textField = new JTextField();
		textField.setBounds(161, 135, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
