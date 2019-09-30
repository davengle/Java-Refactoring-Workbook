package ch3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RobotTest {
	@Test
	public void testRobot() {
        Machine sorter = new Machine("Sorter", "left");
        sorter.put("chips");
        Machine oven = new Machine("Oven", "middle");
        Robot robot = new Robot();

        assertThat(sorter.bin()).isEqualTo("chips");

//        assertEquals("chips", sorter.bin());
//        assertNull(oven.bin());
//        assertNull(robot.location());
//        assertNull(robot.bin());

        robot.moveTo(sorter);
        robot.pick();
        robot.moveTo(oven);
        robot.release();

//        assertNull(robot.bin());
//        assertEquals(oven, robot.location());
//        assertNull(sorter.bin());
//        assertEquals("chips", oven.bin());
    }
}
