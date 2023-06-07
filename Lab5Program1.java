import javax.swing.*;

public class Lab5Program1 {
    public static void main(String[] args) {
			String[] wordArray = Textfileinput(args[0]);
			String isOrIsNot, inputWord;
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		if(wordIsThere(inputWord,wordArray))
			isOrIsNot = "is";
			else
				isOrIsNot = "is not";
		JOptionPane.showMessageDialog(null,"The word " +inputWord+ " "+ isOrIsNot+ " on the list.");
	}
//main		
	public static boolean wordIsThere(String findMe, String [] theList){
		for(int i = 0; i < theList.length; i++){
			if(findMe.equals(theList[i]))
						return true;
		}
		return false;
	}//word is there

	public static String[] Textfileinput(String filename){
		String[] wordArray = new String[10];
		int length = 0;
		TextFileInput in = new TextFileInput(filename);
		String line = in.readLine();
		while(line!=null)
		{
			wordArray[length] = line;
			length++;
			line = in.readLine();
		}
		in.close();
		return wordArray;

	}
}