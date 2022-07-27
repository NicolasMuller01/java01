package Ejercicio4;

public class SmartWatch extends SmartDevice {

    int DEVICE_HOUR;

    public SmartWatch(int DEVICE_HOUR) {
        this.DEVICE_HOUR = DEVICE_HOUR;
    }

    public SmartWatch(String DEVICE_NAME, String DEVICE_TYPE, String DEVICE_VERSION, String DEVICE_MODEL, int DEVICE_HOUR) {
        super(DEVICE_NAME, DEVICE_TYPE, DEVICE_VERSION, DEVICE_MODEL);
        this.DEVICE_HOUR = DEVICE_HOUR;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "DEVICE_HOUR=" + DEVICE_HOUR +
                ", DEVICE_NAME='" + DEVICE_NAME + '\'' +
                ", DEVICE_TYPE='" + DEVICE_TYPE + '\'' +
                ", DEVICE_VERSION='" + DEVICE_VERSION + '\'' +
                ", DEVICE_MODEL='" + DEVICE_MODEL + '\'' +
                '}';
    }
}
