import com.shen.ssm.dao.OrdersDao;
import com.shen.ssm.domain.Orders;
import com.shen.ssm.domain.Page;
import com.shen.ssm.service.OrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OrdersTest {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private OrdersDao ordersDao;

    @Test
    public void test01(){
        System.out.println(ordersService);
    }

    @Test
    public void test02(){
        Page all = ordersService.findAll(2,3);
        System.out.println(all);
    }

    @Test
    public void test04(){
        List<Orders> all = ordersDao.findAll(1, 3);
        System.out.println(all);
    }

    @Test
    public void test05(){
        Orders detailsByID = ordersService.findDetailsByID("0E7231DC797C486290E8713CA3C6ECCC");
        System.out.println("----------------------------------------------------------------");
        System.out.println(detailsByID);
        System.out.println("----------------------------------------------------------------");

    }
}
