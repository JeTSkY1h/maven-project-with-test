package week2.StudentDB;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
import org.junit.jupiter.api.Test;
import week2.StudentDB.inheritance.*;


public class StudentDBHashMapTest { 
    private Map<String, Student> students = new HashMap<>();
    private Student student1 = new HISStudent("Frank Castle", 3, "Boston");
    private Student student0 = new EDVStudent("Beate die behaarte",5,"Dümmlinghause");
    private Student student2 = new EDVStudent("Motoko Kusanagi",1,"Niihama-shi");
    private Student Asterix = new HISStudent("Asterix",1 , "Gallien");

    
    @Test
     void ShouldListStudents(){
        //given
        students.put(student0.getId(),student0);
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        StudentDBHashMap studentDBHashMap = new StudentDBHashMap(students);
        //when 
        Map<String, Student> res = studentDBHashMap.list();
        //then
        assertEquals(students, res);
        assertEquals("Beate die behaarte", students.get(student0.getId()).getName());
     }

     
    @Test
    void ShouldListStudentsAsString(){
        //given
        students.put(student0.getId(),student0);
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        StudentDBHashMap studentDBHashMap = new StudentDBHashMap(students);
        //then
        String actual = studentDBHashMap.toString();
        //when
        String stud1 = "Name: Beate die behaarte\nID: " + studentDBHashMap.list().get(student0.getId()).getId() + "\ngrade: 5\nOrt: Dümmlinghause\n\n"; 
        String stud2 = "Name: Frank Castle\nID: " + studentDBHashMap.list().get(student1.getId()).getId() +"\ngrade: 3\nOrt: Boston\n\n";
        String stud3 = "Name: Motoko Kusanagi\nID: " + studentDBHashMap.list().get(student2.getId()).getId() +"\ngrade: 1\nOrt: Niihama-shi\n\n";
        var res = actual.contains(stud1) && actual.contains(stud2) && actual.contains(stud3);
        assertTrue(res);

         
     }


    @Test
    void shouldAddNewStudent(){
        students.put(student0.getId(),student0);
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        StudentDBHashMap studentDBHashMap = new StudentDBHashMap(students);

        Map<String, Student> expected = new HashMap<String, Student>();
        expected.put(student0.getId(),student0);
        expected.put(student1.getId(),student1);
        expected.put(student2.getId(),student2);
        expected.put(Asterix.getId(),Asterix);
        
        studentDBHashMap.addToDb(Asterix);
        Map<String, Student> actual = studentDBHashMap.list();
        assertEquals(expected, actual);
    }

    @Test
    void shouldthrowException(){
        students.put(student0.getId(),student0);
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        StudentDBHashMap studentDBHashMap = new StudentDBHashMap(students);
        boolean thrown = false;
        Map<String, Student> expected = new HashMap<String, Student>();
        expected.put(student0.getId(),student0);
        expected.put(student1.getId(),student1);
        expected.put(student2.getId(),student2);
        expected.put(Asterix.getId(),Asterix);
        
        studentDBHashMap.addToDb(Asterix);
        
        try {
            studentDBHashMap.addToDb(Asterix);
        } catch (RuntimeException e) {
            thrown = true;
        }
        Map<String, Student> actual = studentDBHashMap.list();
        assertEquals(expected, actual);
        assertTrue(thrown);
    }

    @Test
    void shouldRemoveStudentByName(){
        //given
        students.put(student0.getId(),student0);
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        StudentDBHashMap studentDBHashMap = new StudentDBHashMap(students);
        //When
        studentDBHashMap.removeByName("Asterix");
        Map<String, Student> actual =  studentDBHashMap.list();
        Map<String, Student> expected = students;      
        assertEquals(expected, actual);      
    }
  }