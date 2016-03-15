package newHope;

import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class Display{
    String[] parameters;
    Object[] eventOptions;
    EventStart[] events;

    public Display(String[] parameters, Object[] eventOptions, EventStart[] events) {
        this.parameters = parameters;
        this.eventOptions = eventOptions;
        this.events = events;
    }

    public static void display() throws Exception {
        System.out.println(generateLine());
        for (int i = 0; i< 10; i++) {
            TimeUnit.MILLISECONDS.sleep(300);
            System.out.print(">");
        }
        System.out.println("");
    }

    public void openDialogue()throws Exception{
        int a = 0;
        while (a!=-1) {
            display();
            JTextArea ta = new JTextArea("Choose one");
            ta.setEditable(false);
            ta.setOpaque(false);
            a = JOptionPane.showOptionDialog(null, ta, "title", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, eventOptions, null);
            if (a != -1) {
                events[a].start();
            }
        }
    }

    public static String generateLine() {
        return "age:"+Event.age+" friends:"+Event.friends+" knowledge:"+Event.knowledge+" " +
                "sanity:"+Math.round(Event.sanity*100)+" hunger:"+Math.round(Event.hunger*100)+
                " health:"+Math.round(Event.health*100);
    }
}
