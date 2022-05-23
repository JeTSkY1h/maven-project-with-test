import org.junit.jupiter.api.Test;

import week1.Alarm;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void alarmShouldTriggerCuaseMoreThen30Ppl () {
        //given
        int ppl = 31;
        String AlarmStufe = "gelb";
        //when
        var res = Alarm.checkPpl(ppl,AlarmStufe);
        //then
        assertEquals("Zu viele Personen", res );
    }

    @Test
    void alarmShouldNotTriggerCauseMoreThen30Ppl() {
        //given
        int ppl = 29;
        String AlarmStufe = "gelb";
        //when
        var res = Alarm.checkPpl(ppl,AlarmStufe);
        //then
        assertEquals("Maximale Personenzahl nicht überschritten", res);
    }

    @Test
    void shouldReturn0BecauseAlarmStufeIsRot(){
        //give
        String AlarmStufe = "rot";
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(0,res);
    }

    @Test
    void shouldReturn30BecauseAlarmStufeIsGelb(){
        //give
        String AlarmStufe = "gelb";
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(30,res);
    }

    @Test
    void shouldReturn60BecauseAlarmStufeIsGruen(){
        //give
        String AlarmStufe = "grün";
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(60,res);
    }
}