import com.lilang.distribute.test.facade.CustomerFacade;
import com.lilang.distribute.test.facade.res.CustomerInfoRes;
import com.oracle.tools.packager.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Created by lilang on 17/4/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/applicationContext.xml"})
public class CustomerFacadeImplTest {
    @Autowired
    @Qualifier("customerFacadeBean")
    private CustomerFacade customerFacadeBean;

    @Test
    public void testBuySomething() {
        String traceLogId = UUID.randomUUID().toString();
        customerFacadeBean.buySomething("123", traceLogId);
    }

    @Test
    public void testQueryCustomerInfoByCustomerId() {
        CustomerInfoRes res = customerFacadeBean.queryCustomerInfoById("123456");
        //Log.info(res.toString());
    }
}
