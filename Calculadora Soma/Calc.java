import java.util.Scanner;
public class Calc {
	
	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in); //Dados de entrada pelo teclado
    Num n1 = new Num();
    Num n2 = new Num();
    Num resultado = new Num();
    
    String opc = "S";

    while (opc.equals("y") || opc.equals("Y")) { //loop para continuar outras operações
    System.out.printf("%nDigite o primeiro valor: ");
	n1.setValor(scan.nextInt()); //pega o valor inteiro e armazena em N1 como primeiro valor
	System.out.printf("%nDigite o segundo valor: ");
	n2.setValor(scan.nextInt()); //armazena o segundo valor
	resultado.setValor(n1.getValor() + n2.getValor());
	System.out.printf("%nO valor da soma de %d com %d é: %d ", n1.getValor(), n2.getValor(), resultado.getValor());
	System.out.printf("%nDeseja somar outro valor? responda Y ou N.  %n%n");
	
	opc=scan.next();
	System.out.printf("%n%n%n");
}
}
}