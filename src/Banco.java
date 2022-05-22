import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Banco {
	
	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	public void imprimirContas() {
		System.out.println("_____________________________________");
		for(Conta conta: contas) {
			conta.imprimirExtrato();
		}
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void removeContaID(int numero) {		
		Conta conta;
		
		Iterator<Conta> iterator = this.contas.iterator();	
		
		while(iterator.hasNext()) {
			conta  = iterator.next();
			if(conta.getNumero() == numero) {
				this.contas.remove(conta);
				break;
				}
		}
	}
	
	public void reajusteContasMes() {
		for(Conta conta : contas) {
			conta.atualizar();
		}
	}
	
}
