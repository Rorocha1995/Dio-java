package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo Seletivo! ");
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO","RODRIGO"};
		for(String candidato: candidatos) {
			contadorLigacoes(candidato);
		}
		
	} static void contadorLigacoes(String candidato) {

		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = ! atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("Contato realizado!!");
			
		}while(continuarTentando && tentativasRealizadas<3);
		if(atendeu)
			System.out.println("Conseguimos contato com "+ candidato + " na " + tentativasRealizadas);
		else
			System.out.println("Não conseguimos contato com " + candidato + ", número maximo de tentativas." + tentativasRealizadas);
	}
	static boolean atender() {

		return new Random().nextInt(3) ==1;
	}
	
	static void imprimirCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO","RODRIGO"};
		System.out.println("Imprimindo a lista de candidatos infomando o indice. ");
		for(int indice =0;indice < candidatos.length;indice++) {
			System.out.println("O candidato de nº: " +(indice++) + " é o" + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada For each");
		for(String candidato: candidatos) {
			System.out.println("Candidato Selecionado foi: " + candidato);
		}
	}
	
	static void selecaoCandidato() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO","RODRIGO","MONICA","FABRICIO","MIRELA","JORGE","VIVIAN"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato " + candidato + " Solicitou este valor de sálario: " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " Foi selecionado para entrevista.");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analiseCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato ! ");
		} else if (salarioBase == salarioPretendido)
			System.out.println("Ligar para candidato com contra proposta. ");
		else {
			System.out.println("Aguardando resultados !");
		}
	}
	
}
