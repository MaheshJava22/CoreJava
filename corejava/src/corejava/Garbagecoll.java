package corejava;
public class Garbagecoll {
    static class Student {
        int id;
        Student(int id) {
            this.id = id;
        }
    }
    public static void main(String[] args) {
        //  Assigning null
        Student s1 = new Student(1);
        s1 = null;
        // Reassigning reference
        Student s2 = new Student(2);
        Student s3 = new Student(3);
        s2 = s3;
        // Object created inside a method
        createObject();
        //  Anonymous object
        new Student(4);
        // Displaying the expected order
        System.out.println("Object 5 is garbage collected");
        System.out.println("Object 4 is garbage collected");
        System.out.println("Object 2 is garbage collected");
        System.out.println("Object 1 is garbage collected");
        System.out.println("End of main");
    }

    static void createObject() {
        Student s5 = new Student(5);
    }
}

