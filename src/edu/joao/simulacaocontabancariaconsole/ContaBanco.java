package edu.joao.simulacaocontabancariaconsole;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroConta;
		String ag;
		String nomeCliente;
		double saldo;

		System.out.println("NUMERO DA CONTA: ");
		numeroConta = sc.nextInt();
		System.out.println("NUMERO DA AGENCIA: ");
		sc.nextLine();
		ag = sc.nextLine();
		System.out.println("NOME COMPLETO: ");
		nomeCliente = sc.nextLine();
		System.out.println("SALDO: ");
		saldo = sc.nextDouble();

		System.out.printf(
				"Ola  %s, obrigado por criar uma conta em nosso banco.\nSua agencia e %s, "
						+ "conta %d e seu saldo R$ %.2f ja esta disponivel para saque.",
				nomeCliente, ag, numeroConta, saldo);

		sc.close();

	}

}
