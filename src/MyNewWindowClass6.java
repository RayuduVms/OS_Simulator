import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyNewWindowClass6 extends JDialog {

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
	ImageIcon fifo=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218792872703163.png");
	ImageIcon lru=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218792928248518.png");
	ImageIcon optimal=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218793057931450.png");
	ImageIcon secondchance=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218793125054133 (1).png");
	ImageIcon graph=new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218793192373178.png");

	/**
	 * Create the dialog.
	 */
	public MyNewWindowClass6() {
		getContentPane().setBackground(Color.BLACK);
		setBounds(100, 100, 556, 404);
		getContentPane().setLayout(null);
		
		JButton btnFcfs = new JButton(fifo);
		btnFcfs.setBackground(Color.BLACK);
		btnFcfs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = {};
				FIFO.main(args);
			}
		});
		btnFcfs.setBounds(10, 11, 135, 67);
		getContentPane().add(btnFcfs);
		
		JButton btnSjf = new JButton(lru);
		btnSjf.setBackground(Color.BLACK);
		btnSjf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = {};
				LRU.main(args);
				
			}
		});
		btnSjf.setBounds(387, 11, 135, 67);
		getContentPane().add(btnSjf);
		
		JButton btnSrtf = new JButton(optimal);
		btnSrtf.setBackground(Color.BLACK);
		btnSrtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = {};
				OPTIMAL.main(args);
			}
		});
		btnSrtf.setBounds(10, 274, 175, 80);
		getContentPane().add(btnSrtf);
		
		JButton btnRr = new JButton(secondchance);
		btnRr.setBackground(Color.BLACK);
		btnRr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] args = {};
				SECOND_CHANCE.main(args);
			}
		});
		btnRr.setBounds(251, 274, 279, 80);
		getContentPane().add(btnRr);
		
		
		JButton btnGraphs = new JButton(graph);
		btnGraphs.setBackground(Color.BLACK);
		btnGraphs.addActionListener(new ActionListener() {
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

			public void actionPerformed(ActionEvent arg0) {

				int fifo[] = new int[3];
				int n;
		//		Scanner br = new Scanner(System. in );
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
				
				
//				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        int frames, pointer = 0, hit = 0, fault = 0,ref_len;
		        boolean isFull = false;
		        int buffer[];
		        int reference[];
		        int mem_layout[][];
		        
		   //     System.out.println("Please enter the number of Frames: ");
		       frames = 3;
		        
		    //    System.out.println("Please enter the length of the Reference string: ");
		        ref_len = n;
		        
		        reference = new int[ref_len];
		        mem_layout = new int[ref_len][frames];
		        buffer = new int[frames];
		        for( j = 0; j < frames; j++)
		                buffer[j] = -1;
		        
		        System.out.println("Please enter the reference string: ");
		        for(int i = 0; i < ref_len; i++)
		        {
		            reference[i] = inp[i];
		        }
		        System.out.println();
		        for(int i = 0; i < ref_len; i++)
		        {
		         int search = -1;
		         for( j = 0; j < frames; j++)
		         {
		          if(buffer[j] == reference[i])
		          {
		           search = j;
		           hit++;
		           break;
		          } 
		         }
		         if(search == -1)
		         {
		          if(isFull)
		          {
		           int index[] = new int[frames];
		           boolean index_flag[] = new boolean[frames];
		           for( j = i + 1; j < ref_len; j++)
		           {
		            for(int k = 0; k < frames; k++)
		            {
		             if((reference[j] == buffer[k]) && (index_flag[k] == false))
		             {
		              index[k] = j;
		              index_flag[k] = true;
		              break;
		             }
		            }
		           }
		           int max = index[0];
		           pointer = 0;
		           if(max == 0)
		            max = 200;
		           for( j = 0; j < frames; j++)
		           {
		            if(index[j] == 0)
		             index[j] = 200;
		            if(index[j] > max)
		            {
		             max = index[j];
		             pointer = j;
		            }
		           }
		          }
		          buffer[pointer] = reference[i];
		          fault++;
		          if(!isFull)
		          {
		           pointer++;
		              if(pointer == frames)
		              {
		               pointer = 0;
		               isFull = true;
		              }
		          }
		         }
		            for( j = 0; j < frames; j++)
		                mem_layout[i][j] = buffer[j];
		        }
		        
//		        for(int i = 0; i < frames; i++)
		 //       {
		 //           for( j = 0; j < ref_len; j++)
//		                System.out.printf("%3d ",mem_layout[j][i]);
		 //           System.out.println();
		 //       }
		        
		       // System.out.println("The number of Hits: " + hit);
		      //  System.out.println("Hit Ratio: " + (float)((float)hit/ref_len));
		        System.out.println("The number of Faults: " + fault);
		        
		        
		        int z,
				m = 0,
				faults = 0;
		        hit=0;
//				InputStreamReader isr = new InputStreamReader(System. in );
//				BufferedReader br = new BufferedReader(isr);
//				System.out.println("enter the size of the array");
//				int n = Integer.parseInt(br.readLine());
				int a[] = new int[n];
				int flag[] = new int[n];
				System.out.println("enter the elements");
				for (int i = 0; i < n; i++) {
					a[i] = inp[i];
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
//				System.out.println("no of hits" + hit);
				System.out.println("no of faults" + faults);
				int fault3=faults;
				w3 s=new w3(null);
				s.createAndShowGui(Fault, fault, faults, fault3);
		
			}
		});
		btnGraphs.setBounds(200, 147, 135, 67);
		getContentPane().add(btnGraphs);
	

	}
}
