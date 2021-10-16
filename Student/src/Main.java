import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //Opretter en scanner objekt
        Scanner input = new Scanner(System.in);

        //Erklære objekter og giver dem værdier.
        Student student1 = new Student("Mads", "Hansen", 25, 180, false,"Nørrebrogade" );
        Student student2 = new Student("Adam", "Jensen", 21, 170, false, "Gade");
        Student student3 = new Student("Kirsten", "Petersen", 35, 175, true, "Fredrikssundsvej");

        // Lægger vores 3 objekter ind i studentArray.

        Student[] studentArray = new Student[10];
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;
        studentArray[3] = makeStudent(input);
        // Kalder min printObjekt med studentArray som parameter.
        Student.printObject(studentArray);

        System.out.println("Do you want to change the address? ");
        String ans = input.nextLine();
        if(ans.equals("Yes") || ans.equals("yes")){

            changeAddress(input, studentArray[3]);
            Student.printObject(studentArray);

        }else if(ans.equals("No") || ans.equals("no")){
            System.out.println("Okay bye");
        }
    }

    private static Student makeStudent(Scanner scan) {
        System.out.println("Enter your new object:\n ");

        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter lastName: ");
        String lastName = scan.nextLine();
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Enter height: ");
        int height = scan.nextInt();
        System.out.println("Enter true for female and false for male: ");
        Boolean gender = scan.nextBoolean();
        scan.nextLine();
        System.out.println("Enter address: ");
        String address = scan.nextLine();

        Student stu = new Student(name, lastName, age, height, gender, address);
        System.out.println(stu);
        System.out.println();
        return stu;


    }

    public static void changeAddress(Scanner scan, Student student) {

        System.out.println("Enter a new address: ");
        String address = scan.nextLine();
        student.address = address;

    }

}
