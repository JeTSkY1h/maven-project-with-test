package week2;

public class test {
    public static void main(String[] args) {
        Student[] studArr = new Student[] {
            new Student("Beate die behaaarte",5,"Dümmlinghause"),
            new Student("Frank Castle", 3, "Boston"),
            new Student("Motoko Kusanagi",1,"Niihama-shi")
        };
        StudentDB test = new StudentDB(studArr);
        System.out.println(test.toString());
        
    }
}
