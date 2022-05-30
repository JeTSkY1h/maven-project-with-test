package week1;


public class Alarm {
    
    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";
    
    public static int setAlarmStufe(AlarmLevel alarmLevelEnum) {
        return alarmLevelEnum.getAlarmLevel();
    }

    public static String checkPpl(int n, AlarmLevel alarmStufe) {
        return  n > alarmStufe.getAlarmLevel()  ? WARNING_MESSAGE : OK_MESSAGE;
    }
}


