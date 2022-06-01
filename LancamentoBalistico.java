import java.util.Scanner;

public class LancamentoBalistico {
	private static final double GRAVIDADE = 9.807;

	public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);
		double angulo = 0;
		double velocidade = 0;
		double tempoTotal = 0;
		double distanciaFinal = 0;
		double distanciaTempoATempo = 0;
		System.out.println("Informe o ângulo de lançamento: ");
		angulo = leitor.nextDouble();

		System.out.println("Informe a velocidade inicial  do lançamento: ");
		velocidade = leitor.nextDouble();
		leitor.close();

		angulo = ((Math.PI * angulo)/ 180);
		tempoTotal = ((2 * velocidade* Math.sin(angulo)) / GRAVIDADE);
		distanciaFinal = ((Math.pow(velocidade, 2 )* Math.sin(2 * angulo)) / GRAVIDADE);
		for (int i = 0 ; i < tempoTotal ; i++) {
			distanciaTempoATempo = (velocidade * Math.cos(angulo)* i);
			System.out.println("No instante " + i + " segundos, o projetil estará em " + distanciaTempoATempo + " metros");	
		}
		System.out.println("O projetil para no instante " + tempoTotal + " segundos");
		System.out.println("O projetil para no instante " + distanciaFinal + " metros do lançamento");
	}
}
