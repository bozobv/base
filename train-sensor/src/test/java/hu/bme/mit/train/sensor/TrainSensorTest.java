package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;




import static org.mockito.Mockito.*;

public class TrainSensorTest {
	int test;

    @Before
    public void before() {
    	test = 1;
		
    }

    @Test
    public void ThisIsAnExampleTestStub() {
		test++;
		Assert.assertEquals(2, test);


    }
}
