
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println("Saldo atual: " + contaDaMarcela.getSaldo());
		// contaDaMarcela.pegaSaldo() += 200;
		System.out.println(contaDaMarcela.getSaldo());
		
		System.out.println(contaDaMarcela.titular);
		contaDaMarcela.titular = new Cliente();
		
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
	}
}
