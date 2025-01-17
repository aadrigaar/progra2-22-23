import org.junit.Assert;
import org.junit.Test;

public class SubjectTest {
    @Test
    public void testAddStudent() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("Andres", "Gonzalez", "5897", 2.0f);
        Student student2 = new Student("Jordi", "Evole", "4687", 9.0f);
        Student student3 = new Student("Jordi", "Ricard", "7687", 8.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        Assert.assertEquals(3, subject.getPosition());   }
    @Test
    public void testOrderStudents() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("Andres", "Gonzalez", "5897", 2.0f);
        Student student2 = new Student("Jordi", "Evole", "4687", 9.0f);
        Student student3 = new Student("Jordi", "Ricard", "7687", 8.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.orderStudents();
        Assert.assertEquals(student3, subject.getStudents()[0]);
        Assert.assertEquals(student2, subject.getStudents()[1]);
        Assert.assertEquals(student1, subject.getStudents()[2]);   }
    @Test
    public void testGetBestStudent() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("Andres", "Gonzalez", "5897", 2.0f);
        Student student2 = new Student("Jordi", "Evole", "4687", 9.0f);
        Student student3 = new Student("Jordi", "Ricard", "7687", 8.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.orderStudents();
        Assert.assertEquals(student3, subject.getBestStudent());   }
    @Test
    public void testGetWorstStudent() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("Andres", "Gonzalez", "5897", 2.0f);
        Student student2 = new Student("Jordi", "Evole", "4687", 9.0f);
        Student student3 = new Student("Jordi", "Ricard", "7687", 8.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.orderStudents();
        Assert.assertEquals(student1, subject.getWorstStudent());   }
    @Test
    public void testGetAverage() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("Andres", "Gonzalez", "5897", 2.0f);
        Student student2 = new Student("Jordi", "Evole", "4687", 9.0f);
        Student student3 = new Student("Jordi", "Ricard", "7687", 8.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.orderStudents();
        Assert.assertEquals(5.0f, subject.getAverageGrade(), 0.0f);   }
    @Test
    public void testGetMedian() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("Andres", "Gonzalez", "5897", 2.0f);
        Student student2 = new Student("Jordi", "Evole", "4687", 9.0f);
        Student student3 = new Student("Jordi", "Ricard", "7687", 8.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.orderStudents();
        Assert.assertEquals(5.0f, subject.getMedianGrade(), 0.0f);    }}