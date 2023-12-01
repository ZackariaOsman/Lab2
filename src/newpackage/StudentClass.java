package newpackage;

/**
 *
 * @author osman
 */

//code really starts here
public class StudentClass {

    //these are attributes, attributes of the class. In this case for a student.
    private String name;
    private int age;
    private float gpa;
    
    //this is a contructor used to instanciate the class
    public StudentClass(String name, int age, float gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    //this is another contructor. you can choose what you want to use when you create an instance.
    public StudentClass() {
    }
    

    //these are called getters and setters
    //they are a methods like thoses bellow that serve to only retreive data on attributes of a class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    
    
    //this section is called methods, they are the do functions
    public void Study() {
        System.out.println(this.name + "is studying.");
    }

    public void Eat() {
        System.out.println(this.name + "is eating.");
    }

    public void Sleep() {
        System.out.println(this.name + "is sleeping.");

    }

    public void GoingBroke() {
        System.out.println(this.name + "is going broke.");

    }

    public void Drive() {
        System.out.println(this.name + "is driving.");

    }

    public void Partying() {
        System.out.println(this.name + "is partying.");

    }

}
