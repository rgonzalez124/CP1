import javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  //Creates the new JFrame and sets the title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closes the operation when you close
        frame.setSize(400, 400); //How large you want the frame

        Shapes r = new Shapes(); // a new shape object
        frame.add(r); // putting r on the frame

		frame.setVisible(true); // makes the frame visible visible
	}
