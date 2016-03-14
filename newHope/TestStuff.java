package newHope;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestStuff {
	public static void display(){
		System.out.println("age:"+Event.age+" friends:"+Event.friends+" knowledge"+Event.knowledge+" sanity:"+Event.sanity+" hunger:"+Event.hunger+" health:"+Event.health);
	}
	public static void main(String[] args){
		EventEnd partyEnd = new EventEnd(1,0,-0.1,0.1,-0.05);
		EventStart partyStart = new EventStart(1,0,0,0,0,0,partyEnd);
		EventEnd studyEnd = new EventEnd(0,1,0.05,-0.1,0);
		EventStart studyStart = new EventStart(1,0,0,0.5,0,0,studyEnd);
		EventEnd sleepEnd = new EventEnd(0,0,0.5,-0.1,0.1);
		EventStart sleepStart = new EventStart(1,0,0,0,0,0,sleepEnd);
		EventStart[] events = {partyStart,studyStart,sleepStart};
		int a = 0;
		while (a!=-1){
			display();
			Object[] options = {"Party", "Study", "Sleep"};
			JTextArea ta = new JTextArea("Choose one");
			ta.setEditable(false);
			ta.setOpaque(false);
			a = JOptionPane.showOptionDialog(null, ta , "title", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
			if (a!=-1){
				events[a].start();
			}
		}
	}
}
