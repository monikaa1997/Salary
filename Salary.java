import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Teacher teacher = new Teacher();
        Lawyer lawyer = new Lawyer();
        Policeman policeman = new Policeman();
        teacher.places();
        teacher.salary();
        lawyer.places();
        lawyer.salary();
        policeman.places();
        policeman.salary();
    }
}
