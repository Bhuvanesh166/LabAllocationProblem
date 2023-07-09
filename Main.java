import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lab1= scanner.nextInt();
        int lab2= scanner.nextInt();
        int lab3= scanner.nextInt();
        int students= scanner.nextInt();
        System.out.println(((lab1>students && Math.abs(lab1-students)<=Math.abs(lab2-students) && Math.abs(lab1-students)<=Math.abs(lab3-students))?"L1":(lab2>students &&  Math.abs(lab2-students)<=Math.abs(lab3-students))?"L2":"L3"));

    }
}