public class Person {
    private String name;
    private String surname;
    private int tickets;

    public Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }
    public int getTickets(){
        return tickets;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int spendTicket(){
         tickets -= 1;
        return tickets;
    }
}
