package week1;

public enum AlarmLevel {
    ROT(0),
    GELB(30),
    GRÜN(60);

    private final int alarmLevel;

    private AlarmLevel(int alarmLevel){
        this.alarmLevel = alarmLevel;
    }

    public int getAlarmLevel(){
        return alarmLevel;
    }
}
    

