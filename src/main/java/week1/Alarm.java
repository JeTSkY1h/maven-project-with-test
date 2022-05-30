package week1;


public class Alarm {
    
    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";
    
    public static int setAlarmStufe(AlarmLevelEnum alarmLevelEnum) {
        
        switch (alarmLevelEnum){
            case ROT:
                return 0;
            case GELB:
                return 30;
            case GRÜN:
                return 60;
            default:
                return 0;
        }
    }

    public static String checkPpl(int n, AlarmLevelEnum alarmStufe) {
        return alarmStufe.equals(AlarmLevelEnum.ROT) ? WARNING_MESSAGE : n > setAlarmStufe(alarmStufe)  ? WARNING_MESSAGE : OK_MESSAGE;
    }
}


