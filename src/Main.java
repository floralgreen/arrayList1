import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Student stud1 = new Student("Federico",23);
        Student stud2 = new Student("Mario",25);

        //Creo lista con n elementi
        List<Student> insiemeStudenti = new ArrayList<>(List.of(stud1,stud2));

        //stamp lista
        System.out.println(insiemeStudenti);

        //istanzio nuovi oggetti
        Student stud3 = new Student("Luigi",27);
        Student stud4 = new Student("Giuseppe",35);
        Student stud5 = new Student("Chiara",25);
        Student stud6 = new Student("Matteo",24);

        //aggiungo oggetti alla lista
        insiemeStudenti.add(stud3);
        insiemeStudenti.add(stud4);
        insiemeStudenti.add(stud5);
        insiemeStudenti.add(stud6);

        //ristampo la lista aggiornata
        System.out.println(insiemeStudenti);





    }


}
