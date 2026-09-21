//Method 1: Using new keyword
                   //create a class
class Student {
    String name;
    int age;

                    //create constructor
    Student() {
        name = "Anu";
        age = 20;
    }
}                    //create a object
public class ObjectCreation {
    static void main(String[] args) {

        Student student = new Student();

        System.out.println(student.name);
        System.out.println(student.age);
    }
}

//Method 1:new key method
class OjectCreation {
void display() {
    System.out.println("Image created");
}

public static void main(String[] args) {
    OjectCreation oc = new OjectCreation();
    oc.display();
}
}
//Method:2 reflection
class Student {

    String name = "Anu";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectCreation {

    public static void main(String[] args)
            throws Exception {

        Class<?> c = Student.class;

        Student student1 =
                (Student) c.getDeclaredConstructor().newInstance();

        student1.display();
    }
}

//Method:3 clone () method it duplicate the object

//it allow to clone the student object

class Student implements Cloneable {

    String name = "Anu";
    int age = 20;

    // clone method
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectCreation {

    public static void main(String[] args) throws CloneNotSupportedException {

        // first object
        Student student1 = new Student();

        // clone object
        Student student2 = (Student) student1.clone();

        // first object
        System.out.println("Student 1:");
        student1.display();

        // second object
        System.out.println("\nStudent 2:");
        student2.display();
    }
}


//Method 4:Deserilization
import java.io.*;

class Student implements Serializable {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectCreation {

    public static void main(String[] args) throws Exception {

        // Create first object
        Student student1 = new Student("Anu", 20);

        // Serialization
        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream("student.txt"));

        out.writeObject(student1);
        out.close();

        // Deserialization
        ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("student.txt"));

        Student student2 =
                (Student) in.readObject();

        in.close();

        // Display object
        student2.display();
    }
}

//Method 5: FACTOR
class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Factory Method
    static Student createStudent() {
        return new Student("Anu", 20);
    }
}

public class ObjectCreation {

    public static void main(String[] args) {

        Student s1 = Student.createStudent();

        s1.display();
    }
}
