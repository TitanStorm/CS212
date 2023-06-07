public  class Project1 {
    //this calls the file text so that the code can read what needs to be outputted
        public static String filename = "project1.txt";
    //this calss is ised to to set the parameters for the GUI so that the code understands what need to be passed 
    //as well as what will be outputted to the user
        public static void main(String[] args) {
            String[] romanArray = new String[100];
            Integer[] numArray = new Integer[100];
            int count =inputFromFile(filename, romanArray);
    
            for(int i=0; i<count; i++){
                numArray[i] = valueOf(romanArray[i]);
            }
            
            new RomanANumeralGUI(romanArray, numArray, count);
    
        }
    //this class is used to use as a comparison value for 
        private static int inputFromFile(String filename, String[] num) {
            //this calls a new TextFileInput called "input" so that we can read the inputted data from the file
            TextFileInput input = new TextFileInput(filename);
            int lengthFilled = 0;
            String line = input.readLine();
            //this whole thing keeps track of how many elements are being stored in the num array
            while (lengthFilled < num.length && line != null) {
                String[] splitLine = line.split(",");
                for (String s : splitLine) {
                    if (!s.trim().isEmpty()) {
                        num[lengthFilled++] = s.trim();
                    }
                }
                line = input.readLine();
            }
            input.close();
            return lengthFilled;
        }
      
    //this is the class used for comparison of whats inputted vs the roman numeral conversion
        public static int valueOf(String x) {
            int y = 0;
            int prevVal = 0;
            int currVal = 0;
        
            for (int i = x.length() - 1; i >= 0; i--) {
                currVal = getValue(x.charAt(i));
                if (currVal < prevVal) {
                    y -= currVal;
                } else {
                    y += currVal;
                }
                prevVal = currVal;
            }
        
            return y;
        }
        //everything in this class is used to caluclate the roman numeral converson
        private static int getValue(char ch) {
            //set the value for each char to int value
            if (ch == 'I') return 1;
            if (ch == 'V') return 5;
            if (ch == 'X') return 10;
            if (ch == 'L') return 50;
            if (ch == 'C') return 100;
            if (ch == 'D') return 500;
            if (ch == 'M') return 1000;
            return 0;
        }
        
    }