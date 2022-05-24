package week2.inheritance;


public class HISStudent extends Student {

    private String subject = "history";

    public HISStudent(String name,int grade, String location){
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
