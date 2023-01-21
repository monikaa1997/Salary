public class Teacher implements Workers{
    public void places() {

        System.out.println("Teacher: 32 places left");
    }

    public void salary() {
        int days = 25;
        int hours = 10;
        int salary = 20 * hours * days;
        System.out.println("Your salary is " + salary + " for 1 month");
    }
}
