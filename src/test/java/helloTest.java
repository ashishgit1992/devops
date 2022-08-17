import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import sun.jvm.hotspot.HelloWorld;

import static org.mockito.Mockito.mock;

@RunWith(JUnit4.class)
public class helloTest {
    @Test
    public void testProcess()
    {
        HelloProj test =mock(HelloProj.class);
        Assert.assertEquals(9,test.getSuccess());
    }


}
