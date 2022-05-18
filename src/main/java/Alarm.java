public class Alarm {
    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";

    public static void main(String[] args) {

    }

    public static int setAlarmStufe(String alarmString) {

        switch (alarmString){
            case "rot":
                return 0;
            case "gelb":
                return 30;
            case "grün":
                return 60;
            default:
                return 0;
        }
    }

    public static String checkPpl(int n, String alarmStufe) {
        return alarmStufe.equals("rot") ? WARNING_MESSAGE : n > setAlarmStufe(alarmStufe)  ? WARNING_MESSAGE : OK_MESSAGE;
    }
}
