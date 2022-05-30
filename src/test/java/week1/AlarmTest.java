package week1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void alarmShouldTriggerCuaseMoreThen30Ppl () {
        //given
        int ppl = 31;
        AlarmLevel AlarmStufe = AlarmLevel.GELB;
        //when
        var res = Alarm.checkPpl(ppl,AlarmStufe);
        //then
        assertEquals("Zu viele Personen", res );
    }

    @Test
    void alarmShouldNotTriggerCauseMoreThen30Ppl() {
        //given
        int ppl = 29;
        AlarmLevel AlarmStufe = AlarmLevel.GELB;
        //when
        var res = Alarm.checkPpl(ppl,AlarmStufe);
        //then
        assertEquals("Maximale Personenzahl nicht überschritten", res);
    }

    @Test
    void shouldReturn0BecauseAlarmStufeIsRot(){
        //give
        AlarmLevel AlarmStufe = AlarmLevel.ROT;
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(0,res);
    }

    @Test
    void shouldReturn30BecauseAlarmStufeIsGelb(){
        //give
        AlarmLevel AlarmStufe = AlarmLevel.GELB;
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(30,res);
    }

    @Test
    void shouldReturn60BecauseAlarmStufeIsGruen(){
        //give
        AlarmLevel AlarmStufe = AlarmLevel.GRÜN;
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(60,res);
    }
}