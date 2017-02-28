import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SECOND_CHANCE {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SECOND_CHANCE window = new SECOND_CHANCE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
ImageIcon second= new ImageIcon("C:\\Users\\DELL\\Downloads\\cooltext218793125054133 (1).png");
	/**
	 * Create the application.
	 */
	public SECOND_CHANCE() {
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
		
		JButton btnSecondChance = new JButton(second);
		btnSecondChance.setBackground(Color.BLACK);
		btnSecondChance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int frames, pointer = 0, hit = 0, fault = 0,ref_len;
			        boolean isFull = false;
			        int buffer[];
			        int reference[];
			        int mem_layout[][];
			        
			   //     System.out.println("Please enter the number of Frames: ");
			       frames = 3;
			        Random r = new Random();
			    //    System.out.println("Please enter the length of the Reference string: ");
			        ref_len = r.nextInt(10)+1;
			        
			        reference = new int[ref_len];
			        mem_layout = new int[ref_len][frames];
			        buffer = new int[frames];
			        for(int  j = 0; j < frames; j++)
			                buffer[j] = -1;
			        
			        System.out.println("Please enter the reference string: ");
			        for(int i = 0; i < ref_len; i++)
			        {
			            reference[i] = r.nextInt(10)+1;
			        }
			        System.out.println();
			        for(int i = 0; i < ref_len; i++)
			        {
			         int search = -1;
			         for(int j = 0; j < frames; j++)
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
			           for(int j = i + 1; j < ref_len; j++)
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
			           for(int j = 0; j < frames; j++)
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
			            for(int j = 0; j < frames; j++)
			                mem_layout[i][j] = buffer[j];
			        }
			        
//			        for(int i = 0; i < frames; i++)
			 //       {
			 //           for( j = 0; j < ref_len; j++)
//			                System.out.printf("%3d ",mem_layout[j][i]);
			 //           System.out.println();
			 //       }
			        
			       // System.out.println("The number of Hits: " + hit);
			      //  System.out.println("Hit Ratio: " + (float)((float)hit/ref_len));
			        System.out.println("The number of Faults: " + fault);
				       textField.setText(String.valueOf(fault));
			}
		});
		btnSecondChance.setBounds(45, 44, 332, 43);
		frame.getContentPane().add(btnSecondChance);
		
		textField = new JTextField();
		textField.setBounds(167, 115, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}
