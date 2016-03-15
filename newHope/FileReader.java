package newHope;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class FileReader {
    public ArrayList<EventWithConditions> readFromConfig() throws Exception{
        URL url = getClass().getResource("config.txt");
        File file = new File(url.getPath());
        Scanner sc = new Scanner(file);

        ArrayList<EventWithConditions> eventWithConditionsList = new ArrayList<EventWithConditions>();
        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] blocks = line.split(";");

            if(!blocks[0].contains("//")) {
                String eventName = blocks[0];
                String[] maxParamsStr = blocks[1].split(",");
                String[] modParamsStr = blocks[2].split(",");
                String[] minParamsStr = blocks[3].split(",");

                double[] maxParams = new double[maxParamsStr.length];
                double[] modParams = new double[maxParamsStr.length];
                double[] minParams = new double[maxParamsStr.length];

                for (int i = 0; maxParams.length > i; i++) {

                    maxParams[i] = Double.parseDouble(maxParamsStr[i].replace(" ",""));
                    modParams[i] = Double.parseDouble(modParamsStr[i].replace(" ",""));
                    minParams[i] = Double.parseDouble(minParamsStr[i].replace(" ",""));
                }
                //ajutine
                Event event = new Event(modParams, eventName);
                EventWithConditions eventWithConditions = new EventWithConditions(minParams, maxParams, event);
                eventWithConditionsList.add(eventWithConditions);
                //
            }
        }
        return eventWithConditionsList;
    }

}
