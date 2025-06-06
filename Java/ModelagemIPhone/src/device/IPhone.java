package device;

import device.services.AparelhoTelefonico;
import device.services.Internet;
import device.services.ReprodutorMusical;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;


public class IPhone implements AparelhoTelefonico, ReprodutorMusical, Internet {

    private boolean musicaStatus;

    @Override
    public void ligar(String numero) {
        if (musicaStatus) musicaStatus = false;
        System.out.println("Ligando para: " + numero);
        Random random = new Random(LocalDateTime.now().hashCode());
        int randomInt = random.nextInt(15);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Chamando...");
            if(i == randomInt) {
                System.out.println("Atendido!");
                break;
            } else if (i == 10){
                System.out.println("Ninguem atendeu...");
                iniciarCorreioVoz();
            }
        }
    }


    @Override
    public void atender() {
        if (musicaStatus) musicaStatus = false;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(" Tocando...");

            String response = "";
            int test = 0;
            do {
                if(test > 0) System.out.println("------------------\nDigite um valor válido...");

                System.out.println("------------------");
                System.out.println("1 - Atender\n2 - Esperar\n3 - Recusar");
                System.out.println("------------------");
                response = scan.nextLine();
                System.out.println("------------------");
                test++;
            } while(!response.equals("1") && !response.equals("2") && !response.equals("3"));

            if(Integer.parseInt(response) == 1) {
                System.out.println("Atendido!");
                break;
            } else if (Integer.parseInt(response) == 3) {
                System.out.println("Recusado!");
                break;
            }
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe uma mensagem no correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void tocar() {
        if (musicaStatus) musicaStatus = false;
        musicaStatus = true;
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        if (musicaStatus) {
            musicaStatus = false;
            System.out.println("Música pausada...");
        } else System.out.println("Nenhuma música tocando, não é possível pausar...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando música selecionada: " + musica);
    }

    public IPhone() {
        musicaStatus = false;
    }
}
