package test;

import com.oracle.jrockit.jfr.ValueDefinition;
import com.sun.org.glassfish.gmbal.ManagedData;
import com.sun.org.glassfish.gmbal.NameValue;
import com.sun.xml.internal.ws.developer.SchemaValidation;
import org.junit.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import javax.annotation.Resources;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlValue;

public class isPositiveTest {
    @Before
    public void beforeEachMethod(){
        System.out.println("Before Each");
    }
    @BeforeClass
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @Test
    public void checkIsPositiveTrue(){
        isPositive number = new isPositive();
        boolean result = number.isPositive(8);
        Assert.assertTrue(result);

    }
    @Ignore ("This test must be skipped")
    @Test
    public void checkIsPositiveFalse(){
        isPositive number = new isPositive();
        boolean result = number.isPositive(-8);
        Assert.assertFalse(result);

    }

    @Parameterized.Parameters
    //@ValueSource( ints = {1,0,13,234, Integer.MAX_VALUE})
    public void checkIsPositiveTrueParametrized(int number){
        isPositive result = new isPositive();
        Assert.assertTrue(result.isPositive(number));
    }

    @After
    public void afterEach(){
        System.out.println("After each");
    }
    @AfterClass
    public static void afterAll(){
        System.out.println("After All");
    }
}
