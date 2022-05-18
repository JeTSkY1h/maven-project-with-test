import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void alarmShouldTriggerCuaseMoreThen30Ppl () {
        //given
        int ppl = 31;
        //when
        var res = Alarm.moreThen30(ppl);
        //then
        assertEquals("Zu viele Personen", res );
    }

    @Test
    void alarmShouldNotTriggerCauseMoreThen30Ppl() {
        //given
        int ppl = 29;
        //when
        var res = Alarm.moreThen30(ppl);
        //then
        assertEquals("Maximale Personenzahl nicht überschritten", res);
    }
}