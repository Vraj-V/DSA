class Student{
    String name;
    int age;

    void display(){
      System.out.println("Name: " +name+ "\nAge: "+age);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name= "Vraj";
        s1.age = 21;
        s1.display();

}
}
