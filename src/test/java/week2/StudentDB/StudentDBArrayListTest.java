package week2.StudentDB;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import week2.StudentDB.inheritance.EDVStudent;
import week2.StudentDB.inheritance.HISStudent;
import week2.StudentDB.inheritance.Student;


public class StudentDBArrayListTest {
    private ArrayList<Student> students = new ArrayList<>(); {
        students.add(new EDVStudent("Beate die behaarte",5,"Dümmlinghause"));
        students.add(new EDVStudent("Frank Castle", 3, "Boston"));
        students.add(new EDVStudent("Motoko Kusanagi",1,"Niihama-shi"));
       };
    private Student Asterix = new HISStudent("Asterix",1 , "Gallien");
   
    @Test
     void ShouldListStudents(){
        //given
        StudentDBArrayList StudentDBArrayList = new StudentDBArrayList(students);
        //when 
        ArrayList<Student> res = StudentDBArrayList.list();
        //then
        assertEquals(students, res);
        assertEquals("Beate die behaarte", students.get(0).getName());
     }

     @Test
     void ShouldListStudentsAsString(){
         //given
         StudentDBArrayList StudentDBArrayList = new StudentDBArrayList(students);
         //then
         String actual = StudentDBArrayList.toString();
         String expected = "Name: Beate die behaarte\nID: " 
         + StudentDBArrayList.list().get(0).getId() + "\ngrade: 5\nOrt: Dümmlinghause\n\nName: Frank Castle\nID: " 
         + StudentDBArrayList.list().get(1).getId() +"\ngrade: 3\nOrt: Boston\n\nName: Motoko Kusanagi\nID: "
         + StudentDBArrayList.list().get(2).getId() +"\ngrade: 1\nOrt: Niihama-shi\n\n";
        //when
        assertEquals(expected, actual);

     }
   

     @Test
     void shouldAddNewStudent(){
      StudentDBArrayList StudentDBArrayList = new StudentDBArrayList(students);
      ArrayList<Student> expected = new ArrayList<>();
      expected.add(students.get(0));
      expected.add(students.get(1));
      expected.add(students.get(2));
      expected.add(Asterix);
      StudentDBArrayList.addToDb(Asterix);
      ArrayList<Student> actual = StudentDBArrayList.list();
        assertEquals(expected, actual);
      }

     @Test
     void shouldRemoveStudentByName(){
         //given
         StudentDBArrayList StudentDBArrayList = new StudentDBArrayList(students);
         StudentDBArrayList.addToDb(Asterix);
         //When
         StudentDBArrayList.removeByName("Asterix");
         ArrayList<Student> actual =  StudentDBArrayList.list();
         ArrayList<Student> expected = students;      
         assertEquals(expected, actual);      
     }
  }

