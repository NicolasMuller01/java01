package Ejercicio4;

public class SmartPhone extends SmartDevice{
    String DEVICE_SYSTEM_NAME;

    public SmartPhone(String DEVICE_SYSTEM_NAME) {
        this.DEVICE_SYSTEM_NAME = DEVICE_SYSTEM_NAME;
    }

    public SmartPhone(String DEVICE_NAME, String DEVICE_TYPE, String DEVICE_VERSION, String DEVICE_MODEL, String DEVICE_SYSTEM_NAME) {
        super(DEVICE_NAME, DEVICE_TYPE, DEVICE_VERSION, DEVICE_MODEL);
        this.DEVICE_SYSTEM_NAME = DEVICE_SYSTEM_NAME;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "DEVICE_SYSTEM_NAME='" + DEVICE_SYSTEM_NAME + '\'' +
                ", DEVICE_NAME='" + DEVICE_NAME + '\'' +
                ", DEVICE_TYPE='" + DEVICE_TYPE + '\'' +
                ", DEVICE_VERSION='" + DEVICE_VERSION + '\'' +
                ", DEVICE_MODEL='" + DEVICE_MODEL + '\'' +
                '}';
    }
}

