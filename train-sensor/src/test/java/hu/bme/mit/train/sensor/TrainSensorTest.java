package hu.bme.mit.train.sensor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
//import static org.mockito.Mockito.*;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.system.*;

public class TrainSensorTest {
	int test;

    @Before
    public void before() {
    	test = 2;
		
    }

    @Test
    public void ThisIsAnExampleTestStub() {
		test++;
		Assert.assertEquals(3, test);


    }
}
