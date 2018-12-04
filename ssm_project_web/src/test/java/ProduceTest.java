import com.shen.ssm.dao.ProductDao;
import com.shen.ssm.domain.Product;
import com.shen.ssm.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProduceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void test01() {
//        List<Product> all = productService.findAll(currentPages, pageSizes);
//        for (Product product : all) {
//            System.out.println(product);
//        }
    }
    @Test
    public void test02(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        ProductDao bean = context.getBean(ProductDao.class);
        List<Product> all = bean.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
