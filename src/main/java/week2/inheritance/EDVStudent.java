package week2.inheritance;

public class EDVStudent extends Student {

    private String subject = "EDV";

    public EDVStudent(String name,int grade, String location){
        super(name,grade,location);
    }

    public String getSubject() {
        return this.subject;
    }

    @Override
    public String toString(){
        return "Name: " + this.getName() + "\n"
        + "ID: " + this.getId() + "\n"
        + "grade: " + this.getgrade() + "\n" 
        + "Ort: " + this.getLocation() + "\n";
    }
}
