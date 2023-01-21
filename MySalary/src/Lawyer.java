public class Lawyer implements Workers{
    public void places() {

        System.out.println("Lawyer: 25 places left");
    }

    public void salary() {
        int days = 22;
        int hours = 8;
        int salary = 20 * hours * days;
        System.out.println("Your salary is " + salary + " for 1 month");
    }
}
