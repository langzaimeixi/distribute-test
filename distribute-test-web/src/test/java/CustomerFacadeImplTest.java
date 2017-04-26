import com.lilang.distribute.test.facade.CustomerFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lilang on 17/4/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CustomerFacadeImplTest {
    @Autowired
    @Qualifier("customerFacadeBean")
    private CustomerFacade customerFacadeBean;

    @Test
    public void testBuySomething() {
        customerFacadeBean.buySomething("123");
    }
}
