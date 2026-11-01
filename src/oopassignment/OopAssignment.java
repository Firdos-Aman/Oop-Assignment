package oopassignment;
        abstract class Person {
    private String name;
    private int age;
    public Person(String name, int age)
    {
            this.name=name;
            this.age=age;
                    }
    //Encapsulation
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //Abstraction
    public abstract void introduce();
}
//Inheritance
class Student extends Person {
    private String department;
    public Student(String name, int
            age,String department){
        super(name,age);
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    //Polymorphism
    @Override
    public void introduce(){
        System.out.println("My name is" + getName());
        System.out.println("My age is" + getAge());
        System.out.println("My department is" + getDepartment());
        System.out.println("I am a computer science student.");
    }
}
public class OopAssignment{
        public static void main(String[] args){
//Class and Object
Student me = new Student(
"Firdos Aman", 20, "computer science"
);
//Display personal information
System.out.println("=== About Me ===");
me.introduce();
}
}



        
        
    
        
        
        
    
                
    
    
    

            
            
    
    
}