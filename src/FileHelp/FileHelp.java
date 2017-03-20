package FileHelp;

import java.io.*;
import static java.lang.System.out;

public class FileHelp {
    public static void main(String argsp[]){
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        out.println("Use this helpdesk\n" +
                        "For exit enter 'stop");
        do {
            topic = hlpobj.getSelection();

            if (!hlpobj.helpon(topic))
                out.println("Theme not found\n");
        } while (topic.compareTo("stop") != 0);
    }
}


class Help{
    private String helpfile;

    Help(String fname){
        helpfile = fname;
    }

    boolean helpon (String what){
        int ch;
        String topic, info;

        try(BufferedReader helpRdr =
            new BufferedReader(new FileReader(helpfile)))
        {
            do {
                // Read symbols till '#'
                ch = helpRdr.read();

                // Check if theme equals
                if (ch == '#'){
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) { // find theme
                        do {
                            info = helpRdr.readLine();
                            if (info != null) out.println(info);
                        } while ((info != null) &&
                                (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException exc) {
            out.println("Error when access to file");
            return false;
        }
        return false;
    }

    // get the theme of help
    String getSelection(){
        String topic = "";

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        try{
            topic = br.readLine();
        } catch (IOException exc){
            out.println("Error " + exc);
        }
        return topic;
    }
}