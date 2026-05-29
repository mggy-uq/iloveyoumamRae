public class Student extends Person {

    
    private String grade;

    
    public Student(int id, String name, String grade) {
        super(id, name); 
        this.grade = grade;
    }

    
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Name: " + getName() + " | Grade: " + grade);
    }
}