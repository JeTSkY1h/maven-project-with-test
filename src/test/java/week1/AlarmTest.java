package week1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void alarmShouldTriggerCuaseMoreThen30Ppl () {
        //given
        int ppl = 31;
        AlarmLevelEnum AlarmStufe = AlarmLevelEnum.GELB;
        //when
        var res = Alarm.checkPpl(ppl,AlarmStufe);
        //then
        assertEquals("Zu viele Personen", res );
    }

    @Test
    void alarmShouldNotTriggerCauseMoreThen30Ppl() {
        //given
        int ppl = 29;
        AlarmLevelEnum AlarmStufe = AlarmLevelEnum.GELB;
        //when
        var res = Alarm.checkPpl(ppl,AlarmStufe);
        //then
        assertEquals("Maximale Personenzahl nicht überschritten", res);
    }

    @Test
    void shouldReturn0BecauseAlarmStufeIsRot(){
        //give
        AlarmLevelEnum AlarmStufe = AlarmLevelEnum.ROT;
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(0,res);
    }

    @Test
    void shouldReturn30BecauseAlarmStufeIsGelb(){
        //give
        AlarmLevelEnum AlarmStufe = AlarmLevelEnum.GELB;
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(30,res);
    }

    @Test
    void shouldReturn60BecauseAlarmStufeIsGruen(){
        //give
        AlarmLevelEnum AlarmStufe = AlarmLevelEnum.GRÜN;
        //when
        var res = Alarm.setAlarmStufe(AlarmStufe);
        //then
        assertEquals(60,res);
    }
}