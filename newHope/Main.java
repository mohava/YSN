package newHope;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args)throws Exception{
        FileReader fr = new FileReader();

        ArrayList<EventWithConditions> eventWithConditionsArray = fr.readFromConfig();
        EventWithConditions[] events = new EventWithConditions[eventWithConditionsArray.size()];
        events = eventWithConditionsArray.toArray(events);


        ArrayList<Object> optionsList = new ArrayList<>();
        for(int i = 0; i <events.length; i++ ){
            optionsList.add(events[i].event.eventName);
        }
        Object[] options = new Object[optionsList.size()];
        options = optionsList.toArray(options);

        Display dp = new Display(null, options ,events);
        dp.openDialogue();

	}
}
