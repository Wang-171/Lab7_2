import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentTest {

    @Test
    public void testGetName() {
        Student student = new Student("S123", "Alice", 20);
        Assert.assertEquals(student.getName(), "Alice");
    }

    @Test
    public void testSetAge() {
        Student student = new Student("S123", "Alice", 20);
        student.setAge(25);
        Assert.assertEquals(student.getAge(), 25);
    }

    @Test
    public void testUpdateName() {
        Student student = new Student("S123", "Alice", 20);
        student.updateName("Bob");
        Assert.assertEquals(student.getName(), "Bob");
    }
}
