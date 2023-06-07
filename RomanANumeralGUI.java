import java.awt.GridLayout;
import javax.swing.*;        
//everything above is a package for the GUI
public class RomanANumeralGUI{



    //this constructor is used to pass the data types to project 1
    public RomanANumeralGUI(String[] romanArray, Integer[] numArray, int count) {

        createAndShowGUI(romanArray, numArray, count);

    }
    //this creates the whole GUI class
   
   private static void createAndShowGUI (String[] roman, Integer[] numbers, int size) {
        //Create and set up the window.
        //everything below is the parameters for the frame (size of window)
        JFrame frame = new JFrame("Project1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 100,100);//width, height);
        frame.setLocation(200,200);//x, y);
        frame.setLayout(new GridLayout(1,2));//1=row 2=col

        JTextArea textArea = new JTextArea(5, 20);
        //user cannot edit the text
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);
        
        textArea.setText("ROMAN: "+"\n");
        //this is just so that the code can loop through the roman numeral list. every loop will print the numerals
        for(int i=0; i<size; i++) {
            textArea.append(roman[i] + "\n");            
        }
        JTextArea textArea2 = new JTextArea(5, 20);
        textArea2.setEditable(false);
        frame.getContentPane().add(textArea2);
        textArea2.setText("NUMERICAL: "+"\n");

        for(int i=0; i<size; i++) {
            textArea2.append(numbers[i] + "\n");            
        }
        

        //This will display the entire window
        frame.pack();
        frame.setVisible(true);
        

    }    

        
}