package master;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Joptpanetest {
	public static void main(String[] args){
		Object[] options = {"test1", "test2", "thelogestverylongtest3"};
		JTextArea ta = new JTextArea("test pane, pls ignr\ttesttest\nUse hashtags to g");
		ta.setEditable(false);
		ta.setOpaque(false);
		ta.setText("mõtlesin ümber, tahan seda texti testida\n\t\t-LE");
		System.out.println(JOptionPane.showOptionDialog(null, ta , "yes", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null));
	}
}
