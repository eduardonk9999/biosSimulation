# Simulação de BIOS em Java

Este projeto é uma simulação básica de uma BIOS (Basic Input/Output System) implementada em Java. Utiliza a biblioteca OSHI (Operating System and Hardware Information) para obter informações detalhadas sobre o hardware do sistema, como processador, memória RAM e sistema operacional.

## Descrição do Projeto

A BIOS é um firmware essencial para o funcionamento de um computador. Ela é responsável por realizar o processo de inicialização do hardware, executar o Power-On Self Test (POST), carregar o bootloader e, finalmente, inicializar o sistema operacional. Este projeto em Java simula algumas das funções básicas de uma BIOS.

## Funcionalidades

- **Inicialização do Hardware**: Obtém e exibe informações detalhadas sobre o processador, memória RAM e sistema operacional.
- **Power-On Self Test (POST)**: Simula o POST, verificando se o hardware está funcionando corretamente.
- **Carregamento do Bootloader**: Simula o carregamento do bootloader.
- **Inicialização do Sistema Operacional**: Simula a inicialização do sistema operacional.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal utilizada para desenvolver o projeto.
- **OSHI**: Biblioteca Java usada para obter informações detalhadas sobre o hardware e o sistema operacional.
- **Maven**: Ferramenta de gerenciamento de dependências e construção de projetos.


## Como Executar

1. **Clone o repositório**:

   ```sh
   git clone https://github.com/seu-usuario/seu-repositorio.git
   Navegue até o diretório do projeto:
   cd my-project
   // Rode o projeto:
   mvn clean install 
   mvn exec:java -Dexec.mainClass="SimulacaoBIOS"...
  ---

## Funcionalidades
```sh
Iniciando a simulação da BIOS...
Inicializando componentes de hardware...
Processador:
Modelo: Intel(R) Core(TM) i7-9700K CPU @ 3.60GHz
Número de núcleos físicos: 8
Número de núcleos lógicos: 8
Memória RAM:
Total: 16.0 GiB
Disponível: 10.5 GiB
Sistema Operacional:
Nome: Windows 10
Realizando o Power-On Self Test (POST)...
Testando memória...
Testando processador...
POST concluído com sucesso.
Carregando o bootloader...
Bootloader carregado com sucesso.
Iniciando o sistema operacional...
Sistema operacional em execução.
Sistema operacional iniciado com sucesso.
--


   
   
   

   


