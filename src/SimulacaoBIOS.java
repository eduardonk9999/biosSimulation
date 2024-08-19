import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

//

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
        System.out.println("Processador: ");
        System.out.println("Modelo: " + processor.getProcessorIdentifier().getName());
        System.out.println("Número de núcleos físicos: " + processor.getPhysicalProcessorCount());
        System.out.println("Número de núcleos lógicos: " + processor.getLogicalProcessorCount());

        GlobalMemory memory = hal.getMemory();
        System.out.printf("Memória RAM:%nTotal: %.1f GiB%nDisponível: %.1f GiB%n",
                memory.getTotal() / (1024.0 * 1024 * 1024),
                memory.getAvailable() / (1024.0 * 1024 * 1024));
    }

    public  void inicializacaoSistemaOperacional() {
        System.out.println("Sistema Operacional:");
        System.out.println("Nome: " + os.getFamily() + " " + os.getVersionInfo().getVersion());
    }

    public void carregarBootloader() {
        System.out.println("Carregando o bootloader...");
        System.out.println("Bootloader carregado com sucesso.");
    }

    public void iniciarSistemaOperacional() {
        System.out.println("Iniciando o sistema operacional...");
        System.out.println("Sistema operacional em execução.");
        System.out.println("Sistema operacional iniciado com sucesso.");
    }

    public static void main(String[] args) {
        SimulacaoBIOS simulacaoBIOS = new SimulacaoBIOS();
        simulacaoBIOS.inicializacaoHardware();
        simulacaoBIOS.iniciarSistemaOperacional();
        simulacaoBIOS.carregarBootloader();
        simulacaoBIOS.iniciarSistemaOperacional();
    }
}