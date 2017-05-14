package evolution.alpha;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnyTest {// AnyConfiguration can be under the same package of AnyTest.
    @Autowired
    private AnyBean anyBean;
	
	@Test
    public void exampleTest() {
        System.out.println(anyBean);
    }
}