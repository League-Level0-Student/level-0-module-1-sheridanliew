import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "This is a 3-Question Riddle Quiz. To win, get 3 out of 3 questions correct.");
		// 1. Make a variable to hold the score
int score=0;
JOptionPane.showMessageDialog(null, "Your score is currently 0 points.");		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer=JOptionPane.showInputDialog("What is greater than God, more evil than the devil; the poor have it, the rich need it, and if you eat it, you'll die?");
if(answer.equals("nothing")) {
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
JOptionPane.showMessageDialog(null, "Correct!");
score+=1;
JOptionPane.showMessageDialog(null, "Your score is currently 1 point.");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry, the correct answer was \"Nothing.\"");
}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

String answer2=JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
if(answer2.equals("incorrectly")) {
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
JOptionPane.showMessageDialog(null, "Correct!");
score+=1;
JOptionPane.showMessageDialog(null, "Your score is currently 2 points.");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry, the correct answer was \"Incorrectly.\"");
}
	

String answer3=JOptionPane.showInputDialog("Imagine you are in a dark room. How do you get out?");
if(answer3.equals("stop imagining")) {
			// 4. If they got the answer right, pop up "correct!" and increase the score by one
JOptionPane.showMessageDialog(null, "Correct!");
score+=1;
JOptionPane.showMessageDialog(null, "Your score is currently 3 points.");
	}
else {
		JOptionPane.showMessageDialog(null, "Sorry, the correct answer was \"Stop imagining.\"");
	}
if(score==3) {
	JOptionPane.showMessageDialog(null, "Congratulations! You won the 3-Question Riddle Quiz!");
}
}}