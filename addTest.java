//import java.beans.Transient;
import org.junit.*;
public class addTest {
    @Test
    public void testpos(){
        add a=new add();
        Assert.assertEquals(5,a.addNo(2, 3));
        Assert.assertEquals(3,a.addNo(1,2));
    }

    @Test
    public void testzer(){
        add a=new add();
        Assert.assertEquals(0,a.addNo(0,0));
    }
    @Test
    public void testneg(){
        add a=new add();
        Assert.assertEquals(-5,a.addNo(-3, -2));
    }
}
