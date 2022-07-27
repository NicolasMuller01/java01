package Ejercicio4;

public class SmartDevice {

    // 1.0 Atributos
    String DEVICE_NAME;
    String DEVICE_TYPE;
    String DEVICE_VERSION;
    String DEVICE_MODEL;

    // 2.0 Constructores
    public SmartDevice(){}
    public SmartDevice(String DEVICE_NAME, String DEVICE_TYPE, String DEVICE_VERSION, String DEVICE_MODEL) {
        this.DEVICE_NAME = DEVICE_NAME;
        this.DEVICE_TYPE = DEVICE_TYPE;
        this.DEVICE_VERSION = DEVICE_VERSION;
        this.DEVICE_MODEL = DEVICE_MODEL;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "DEVICE_NAME='" + DEVICE_NAME + '\'' +
                ", DEVICE_TYPE='" + DEVICE_TYPE + '\'' +
                ", DEVICE_VERSION='" + DEVICE_VERSION + '\'' +
                ", DEVICE_MODEL='" + DEVICE_MODEL + '\'' +
                '}';
    }
}



