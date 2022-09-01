import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    static Person Vova = new Person("Vova", "Ivanov", 4);
    static Person Shurik = new Person("Shurik", "Timofeev", 3);
    static Person Ivan = new Person("Ivan", "Grozny", 1);
    static Person George = new Person("George", "Miloslavsky", 6);
    static Person Anton = new Person("Anton", "Schpack", 2);

    public static List<Person> generateClients() {
        List<Person> personList = new ArrayList<>();
        personList.add(Vova);
        personList.add(Shurik);
        personList.add(Ivan);
        personList.add(George);
        personList.add(Anton);
        return personList;
    }

    public static void main(String[] args) {
        Queue queueAttraction = new LinkedList();
        for (int i = 0; i < generateClients().size(); i++) {
            queueAttraction.add(generateClients().get(i));

        }
        while (queueAttraction.size() != 0) {
            Person cl = (Person) queueAttraction.poll();
            System.out.print(cl.name + " ");
            System.out.println(cl.surname + " прокатился на аттракционе.");
            cl.tickets = cl.tickets - 1;
            if (cl.tickets > 0) {
                queueAttraction.add(cl);
            }

        }

    }
}
