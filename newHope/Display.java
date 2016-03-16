package newHope;

import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class Display{
    String[] parameters;
    Object[] eventOptions;
    EventConditions[] events;
    EventConditions[] currentEvents;

    public Display(String[] parameters, Object[] eventOptions, EventConditions[] events) {
        this.parameters = parameters;
        this.eventOptions = eventOptions;
        this.events = events;
    }

    private Object[] findOptions(){
    	ArrayList<EventConditions> tempEvents = new ArrayList<EventConditions>();
        ArrayList<Object> optionsList = new ArrayList<>();
        for(int i = 0; i <events.length; i++ ){
            if(events[i].check()==true){
                optionsList.add(events[i].event.eventName);
                tempEvents.add(events[i]);
            }
        }
        while (optionsList.size()>3){
        	int i=(int)(Math.random()*optionsList.size());
        	optionsList.remove(i);
        	tempEvents.remove(i);
        }
        Object[] options = new Object[optionsList.size()];
        currentEvents = new EventConditions[tempEvents.size()];
        options = optionsList.toArray(options);
        currentEvents = tempEvents.toArray(currentEvents);
        return options;
    }

    public static void display() throws Exception {
        System.out.println(generateLine());
        for (int i = 0; i< generateLine().length(); i++) {
            TimeUnit.MILLISECONDS.sleep(10);
            System.out.print(">");
        }
        System.out.println("");
    }

    public void openDialogue()throws Exception{
        int a = 0;
        while (a!=-1) {
            display();
            Object[] temp = findOptions();
            if (temp.length>0){
	            JTextArea ta = new JTextArea("Vali üks");
	            ta.setEditable(false);
	            ta.setOpaque(false);
	            a = JOptionPane.showOptionDialog(null, ta, "ÜSN", JOptionPane.DEFAULT_OPTION,
	                    JOptionPane.QUESTION_MESSAGE, null, temp, null);
	            if (a != -1) {
	                currentEvents[a].start();   
	            }
            }else{
            	JOptionPane.showMessageDialog(null, "Sa surid ära", "ÜSN", JOptionPane.INFORMATION_MESSAGE);
            	User.reset();
            }
        }
    }

    public static String generateLine() {
        return "Vanus:"+ User.age+" Sõbrad:"+ User.friends+" Teadmised:"+ User.knowledge+" Raha:"+User.money+
        		" Mõistus:"+Math.round(User.sanity*100)+" Nälg:"+Math.round(User.hunger*100)+
                " Tervis:"+Math.round(User.health*100);
    }
}
