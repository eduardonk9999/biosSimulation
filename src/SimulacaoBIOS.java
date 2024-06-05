import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
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

    public void inicializacaoHardware() {
        System.out.println("Inicializando componentes de hardware");

        CentralProcessor processor = hal.getProcessor();
        System.out.println("Modelo: " + processor.getProcessorIdentifier().getName());

    }


    public static void main(String[] args) {

    }
}