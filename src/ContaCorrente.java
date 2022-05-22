
public class ContaCorrente extends Conta {

	private double precoManutencao;
	
	public ContaCorrente(Cliente cliente, double precoManutencao) {
		super(cliente);
		this.precoManutencao = precoManutencao;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println(String.format("Preco de Manutenção: %.2f \n", this.precoManutencao));
	}
	
	@Override
	public void atualizar() {
		this.saldo -= precoManutencao;
	}
	
}
