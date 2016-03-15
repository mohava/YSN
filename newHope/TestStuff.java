package newHope;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.concurrent.TimeUnit;

public class TestStuff {

	public static void main(String[] args)throws Exception{
		EventEnd partyEnd = new EventEnd(1,0,-0.1,0.1,-0.05);
		EventStart partyStart = new EventStart(0,0,0,0,0,partyEnd);
		EventEnd studyEnd = new EventEnd(0,1,0.05,-0.1,0);
		EventStart studyStart = new EventStart(0,0,0.5,0,0,studyEnd);
		EventEnd sleepEnd = new EventEnd(0,0,0.5,-0.1,0.1);
		EventStart sleepStart = new EventStart(0,0,0,0,0,sleepEnd);
		EventStart[] events = {partyStart,studyStart,sleepStart};

        Object[] options = {"Party", "Study", "Sleep"};
        Display dp = new Display(null, options,events);
        dp.openDialogue();

	}
}
