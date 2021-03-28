package hu.bme.mit.train.sensor;

import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TrainSensorTest {

    TrainUser user;
    TrainSensor sensor;
    TrainController controller;

    @Before
    public void before() {
        controller = mock(TrainController.class);
        user = mock(TrainUser.class);
        sensor = new TrainSensorImpl(controller, user);
    }

    @Test
    @DisplayName("Setting a negative value for speedlimit")
    public void AbsoluteLimitNegative() {
        sensor.overrideSpeedLimit(-1);
        Mockito.verify(user, times(1)).setAlarmState(true);
    }

    @Test
    @DisplayName("Setting a value over 500")
    public void AbsoluteLimitOver() {
        sensor.overrideSpeedLimit(501);
        Mockito.verify(user, times(1)).setAlarmState(true);
    }

    @Test
    @DisplayName("Setting a value under half")
    public void LessThanHalfSpeedLimit() {
        sensor.overrideSpeedLimit(150);
        sensor.overrideSpeedLimit(50);
        Mockito.verify(user, times(1)).setAlarmState(true);
    }

    @Test
    @DisplayName("Setting a value right, check alarm stay false")
    public void AlarmFalseCheck() {
        when(controller.getReferenceSpeed()).thenReturn(150);
        sensor.overrideSpeedLimit(120);
        Mockito.verify(user, never()).setAlarmState(true);
    }

}
