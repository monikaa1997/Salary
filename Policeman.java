public class Policeman implements Workers{
    public void places() {

        System.out.println("Policeman: 48 places left");
    }

    public void salary() {
        int days = 26;
        int hours = 10;
        int salary = 35 * hours * days;
        System.out.println("Your salary is " + salary + " for 1 month");
    }
}
