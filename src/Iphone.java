public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        public void play() {
            System.out.println("Reproduzindo música...");
        }

        public void pause() {
            System.out.println("Música pausada.");
        }

        public void stop() {
            System.out.println("Música parada.");
        }


        public void ligar() {
            System.out.println("Fazendo uma ligação...");
        }

        public void atender() {
            System.out.println("Atendendo a ligação.");
        }

        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }

        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        public void adicionarNovaAba(String url) {
            System.out.println("Adicionando nova aba com URL: " + url);
        }

        public void atualizarPagina() {
            System.out.println("Atualizando a página.");
        }
    }

