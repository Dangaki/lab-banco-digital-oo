
public class ContaPoupanca extends Conta {
	
	private double taxaRendimento;
	
	public ContaPoupanca(Cliente cliente, double taxaRendimento) {
		super(cliente);
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		System.out.println(String.format("Taxa de Rendimento: %.3f \n", this.taxaRendimento));
	}
	
	@Override
	public void atualizar() {
		this.saldo *= (1d + taxaRendimento);
	}
}
