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
        Queue<Person> queueAttraction = new LinkedList<>();
        for (int i = 0; i < generateClients().size(); i++) {
            queueAttraction.offer(generateClients().get(i));

        }
        while (!queueAttraction.isEmpty()) {
            Person cl = queueAttraction.poll();
            System.out.print(cl.getName() + " ");
            System.out.println(cl.getSurname() + " прокатился на аттракционе.");
            cl.spendTicket();
            if (cl.getTickets() > 0) {
                queueAttraction.add(cl);
            }

        }

    }
}
