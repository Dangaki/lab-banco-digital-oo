

public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco("Caixa");
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		venilton.setEndereco("Rua Sol da Meia-Noite (Jardim Helena) 1234");
		venilton.setEmail("venilton123@email.com");
		
		Conta cc = new ContaCorrente(venilton, 25);
		Conta poupanca = new ContaPoupanca(venilton, 0.2);
		
		cc.depositar(300);
		cc.transferir(100, poupanca);

		banco.addConta(cc);
		banco.addConta(poupanca);
		
		banco.imprimirContas();
		banco.reajusteContasMes();
		banco.imprimirContas();
		
	/*
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	*/
		
		
		
		
	}

}
