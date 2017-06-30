package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.CameraAdapter;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class FrightMachineTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();


    private FrightMachine machine;

    @Before
    public void setUp() throws Exception {
        machine = new FrightMachine();
        machine.addSpookyness(new CameraAdapter(new Camera(5)));
        machine.addSpookyness(new Horn());
        machine.addSpookyness(new Strobe());
    }

    @Test
    public void whenMotionIsDetectedExpectedPluginsKickOff() throws Exception {
        machine.simulateMotion();
        assertThat(systemOutRule.getLog(), allOf(containsString("BEEEEEEEP"),
                                                 containsString("Flashing lights"),
                                                 containsString("Photo #5 taken")));
    }
}