
public class TestaBanco {
	public static void main(String[] args) {
		Cliente kleiton = new Cliente();
		kleiton.nome = "Kleiton Amarante";
		kleiton.cpf = "12345678990";
		kleiton.profissão = "programador";
		
		Conta contaDoKleiton = new Conta();
		contaDoKleiton.depositaDinero(100);
	}
}
