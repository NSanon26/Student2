public class Student {
    public  int age;
    public String grade;
    public String name;

    //Constructor has the same name as the class
    //doesn't have a return type
public Student(int pAge, String pGrade, String pName){
    age = pAge;
    grade = pGrade;
    name = pName;

}

public void display(){
    System.out.print("He is " + age + " years old. He is a " + grade + ". His parents named him " + name + ".");
}
}
