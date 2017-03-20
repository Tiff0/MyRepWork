package QueryDemo;

import static java.lang.System.out;

// Run this demo class
class QDemoRun {
    public static void main (String args[]) {
        QDemo bigQ = new QDemo (100);
        QDemo smallQ = new QDemo(4);
        QDemo forEachMethod = new QDemo(100);
        QDemo CicleElementUse = new QDemo(3,5);

        forEachMethod.CreateArray();

        int i, ch;

        one: out.println("\n\t ***1. Massive of Query*** \n");
        out.println("Use queue bigQ to save alphabet symbols");
        // place symbols in bigQ
        for (i = 0; i < 26; i++)
            bigQ.put(i);

        // output from bigQ and show
        out.println("Queue bigQ: ");
        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch != 0) out.print(ch + " ");
        }

        out.println("\n");

        out.println("Use queue smallQ for mistake generation");

        // Use queue smallQ for mistake generation
        for (i = 0; i < 5; i++){
            out.print("Try to save " + i);
            smallQ.put(i);
            out.println();
        }
        out.println();

        // Additional mistake from smallQ
        out.print("smallQ have: ");
        for (i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch != 0) out.print(ch);
        }

        out.println("\n\n\t ***2. ForEach *** \n");
        two: // Method ForEACH
        forEachMethod.Summa();

        out.println("\n\n\t ***3. 2xCicle *** \n");
        three: CicleElementUse.Create2xArray(3,5);
        CicleElementUse.Summa2();

        out.println("\t ***Edit sentence with substring()*** \n");
        String orgstr = "Java - power of The Internet!";
        String substr = orgstr.substring(7,28);

        out.println("orgstr: " + orgstr);
        out.println("substr: " + substr);

        out.println("Programm has " + args.length + " arguments String");

        for (int w = 0; w < args.length; w++){
            out.println("arg [" + "]" + args[w]);
        }
    }
}
