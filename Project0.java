import javax.swing.*;

public class Project0 {
    public static void main(String[] args) {
        String user, s = "STOP";//Initializes STOP as exit command
    
        while(true){
      
          user = JOptionPane.showInputDialog(null, "Enter a sentence: ");//Prompts User to Enter a message
          int upper_Case = 0, lower_Case = 0;//initializes both small e and big e to 0
          int total = user.length();//stores length of user inputed string
          for(int i = 0; i < total; i++){//for loop runs through stored string
            char ch = user.charAt(i);//returns specified index on string
            int I_of_ch=(ch);//stores each index with i_of_ch
            if(I_of_ch == 101) lower_Case++;//checks and increments using ascii
            if(I_of_ch == 69)  upper_Case++;//^
          }
          
          if(s.equalsIgnoreCase(user)) System.exit(0);//exits window with stop ignoring the case of each letter ex.SToP
          JOptionPane.showMessageDialog(null, "The lower e shows up: " + lower_Case + " \nThe upper e shows up: " + upper_Case);
          }//prints # of little and big e
      }
      
}
