import javax.swing.JOptionPane;
public class MadLibs {
	public static void main(String args[]) {
	String input1 = "";
	String input2 = "";
	String input3 = "";
	String input4 = "";
	String input5 = "";
	String input6 = "";
	
	input1 = JOptionPane.showInputDialog("Input your name.");
	input2 = JOptionPane.showInputDialog("Input a noun!");
	input3 = JOptionPane.showInputDialog("Input a place!");
	input4 = JOptionPane.showInputDialog("Input a verb!");
	input5 = JOptionPane.showInputDialog("Input an adjective!");
	input6 = JOptionPane.showInputDialog("Input a verb!");
	
	JOptionPane.showInputDialog("Once upon a time a young adventure named " + input1 + ". \n While walking down a lonely road " + input1 + " stumbled upon a shining" + input2 + 
			"\n Curious as it was " + input1 + "decided it was best to leave the rock alone, but the young adventureres heart in " + input1 + "\n thundered inside. Quickly spinning around " + input1 +
			"\n picked the rock up and deiced to head for " + input3 + " home to the mages they were sure to know of its worth. While walking down the road a sudden shriek resounded throughout the air" +
			" terrified " +input1 + "quickly " +input4 + "to safety. A giant beast flys over head " + input1 + "\n sighs in relief but alas the rock has been lost!" + input1 + " frantically searches for the rock," + 
			" but when it is nowhere to be found the young adventuer " + input6 + "\n a nearby tree in rage. The young adventurer then returns home back to safety all the while cursing the gods for poor luck."
					);
	

	}

}
