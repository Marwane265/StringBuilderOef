package be.intecbrussel;

public class Main {
    public static void main(String[] args) {

        StringBuilder firstLine = new StringBuilder("This is my first string");
        StringBuilder secLine = new StringBuilder("This is my second string");


        // Hier moest ik een stukje tekst toevoegen.

        //firstLine.append(" en dit is het stukje tekst dat ik moest toevoegen");
        //System.out.println(firstLine);


        //Keer de tekens om van de 2de StringBuilder

        //secLine.reverse();
        //System.out.println(secLine);


        // Verwijder bij de eerste dat er geen spaties meer tussen de woorden staan.
        //1) Je verandert de StringBuilder naar een string
        //2) sout -->naam van de string.replaceAll
        //3) die vervangt dus alle " " (spaties) door ""(geen spaties)

        //String str = firstLine.toString();
        //System.out.println(str.replaceAll(" ", ""));


        //Verwijder bij de 2de StringBuilder 2 woorden

        //secLine.delete(4,10);
        //System.out.println(secLine);


        //of

        //secLine.delete(0,7);
        //System.out.println(secLine);





    }
}
