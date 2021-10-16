import java.util.Arrays;

public class Student {


    String firstName;
    String lastName;
    int age;
    int height;
    boolean gender;
    String address;

    Student(String firstName, String lastName, int age, int height, boolean gender, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.address = address;

    }

    public String getAddress(){
        return address;
    }

    public static void printObject(Student[] studentArray) {

        System.out.println(Arrays.toString(studentArray));

    }

    @Override
    public String toString() {
        String gend = gender?"female": "male";
        return firstName + " " + lastName + " " + age + " " + height + " " + gend + " " + address;
    }


}






