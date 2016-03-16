package newHope;

import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Display{
    String[] parameters;
    Object[] eventOptions;
    EventConditions[] events;

    public Display(String[] parameters, Object[] eventOptions, EventConditions[] events) {
        this.parameters = parameters;
        this.eventOptions = eventOptions;
        this.events = events;
    }

    private Object[] findOptions(){
        ArrayList<Object> optionsList = new ArrayList<>();
        for(int i = 0; i <events.length; i++ ){
            if(events[i].check()==true){
                optionsList.add(events[i].event.eventName);
            }
        }
        Object[] options = new Object[optionsList.size()];
        options = optionsList.toArray(options);
        return options;
    }

    public static void display() throws Exception {
        System.out.println(generateLine());
        for (int i = 0; i< generateLine().length(); i++) {
            TimeUnit.MILLISECONDS.sleep(20);
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
                    JOptionPane.QUESTION_MESSAGE, null, findOptions(), null);
            if (a != -1) {
            	while(!events[a].check())
            		a++;
                events[a].start();
            }
        }
    }

    public static String generateLine() {
        return "age:"+ User.age+" friends:"+ User.friends+" knowledge:"+ User.knowledge+" " +
                "sanity:"+Math.round(User.sanity*100)+" hunger:"+Math.round(User.hunger*100)+
                " health:"+Math.round(User.health*100);
    }
}
