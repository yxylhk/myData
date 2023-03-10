import com.ioc.service.CalculatorService;
import com.ioc.service.impl.CalculatorServiceImpl1;
import com.ioc.service.impl.CalculatorServiceImpl2;
import com.ioc.service.impl.CalculatorServiceImpl3;
import com.ioc.service.impl.CalculatorServiceImpl4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.jupiter.api.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        CalculatorService calculatorService = applicationContext.getBean(CalculatorServiceImpl1.class);
        CalculatorService calculatorService1 = applicationContext.getBean(CalculatorServiceImpl2.class);
        CalculatorService calculatorService2 = applicationContext.getBean(CalculatorServiceImpl3.class);
        CalculatorService calculatorService3 = applicationContext.getBean(CalculatorServiceImpl4.class);

        System.out.println(calculatorService.sum(8,4));
        System.out.println(calculatorService1.sum(6,5));
        System.out.println(calculatorService2.sum(2,8));
        System.out.println(calculatorService3.sum(6,2));
    }
}
