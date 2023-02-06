package test;

import org.junit.*;

public class CalculatorTest {
    @Before
    public void beforeEachMethod(){
        System.out.println("Before each");
    }
    @BeforeClass
    public static void beforeAll(){
        System.out.println("Before all");
    }
    @Test
    public void checkAddition(){
        calculator calculator = new calculator();
        double result = calculator.add(1.50, 22.30);
        Assert.assertEquals(result,23.80,00);
    }

    @Test
    public void checkMultiplication(){
        calculator calculator = new calculator();
        double result = calculator.multiply(4.50,6.00);
        Assert.assertEquals(result,27.0,00);
    }

    @After
    public void afterEachMethod(){
        System.out.println("After each");
    }
   @AfterClass
   public static void afterAll(){
       System.out.println("After all");
   }
}
