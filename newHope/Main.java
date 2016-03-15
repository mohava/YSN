package newHope;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args)throws Exception{
        FileReader fr = new FileReader();

        ArrayList<EventConditions> eventConditionsArray = fr.readFromConfig();
        EventConditions[] events = new EventConditions[eventConditionsArray.size()];
        events = eventConditionsArray.toArray(events);


        ArrayList<Object> optionsList = new ArrayList<>();
        for(int i = 0; i <events.length; i++ ){
            optionsList.add(events[i].event.eventName);
        }
        Object[] options = new Object[optionsList.size()];
        options = optionsList.toArray(options);

        Display dp = new Display(null, options ,events);
        dp.openDialogue();

        //TODO: Kirjutada mängu sisu valmis, UserEvent ja EventConditions klassi saab palju lühemaks siluda

	}
}
