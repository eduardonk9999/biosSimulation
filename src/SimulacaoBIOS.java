import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

public class SimulacaoBIOS {
    private SystemInfo systemInfo;
    private HardwareAbstractionLayer hal;
    private OperatingSystem os;


    public SimulacaoBIOS() {
        systemInfo = new SystemInfo();
        hal = systemInfo.getHardware();
        os = systemInfo.getOperatingSystem();

        System.out.printf("Iniciando a simulação da BIOS...");
    }




    public static void main(String[] args) {

    }
}