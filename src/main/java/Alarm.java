public class Alarm {
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
                return 60;
        }
    }

    public static String checkPpl(int n, String alarmStufe) {
        return n > setAlarmStufe(alarmStufe) ? "Zu viele Personen" : "Maximale Personenzahl nicht überschritten";
    }
}
