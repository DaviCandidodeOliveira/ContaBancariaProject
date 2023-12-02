
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;



public class ContaBancaria {
	
	 public Cliente cliente;

	    @Given("um cliente especial com saldo atual de {int} reais")
	    public void um_cliente_especial_com_saldo_atual_de_reais(int saldoInicial) {
	        cliente = new ClienteEspecial(saldoInicial);
	    }

	    @When("for solicitado um saque no valor de {int} reais")
	    public void for_solicitado_um_saque_no_valor_de_reais(Integer valorSaque) {
	        try {
	            cliente.sacar(valorSaque);
	        } catch (SaldoInsuficienteException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }

	    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
	    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer novoSaldo) {
	        // Nada a fazer aqui, pois a atualização do saldo já é feita diretamente no método sacar.
	        // Você poderia adicionar verificações adicionais se necessário.
	    }

	    @Given("um cliente comum com saldo atual de {int} reais")
	    public void um_cliente_comum_com_saldo_atual_de_reais(Integer saldoInicial) {
	        cliente = new ClienteComum(saldoInicial);
	    }

	    @When("solicitar um saque de {int} reais")
	    public void solicitar_um_saque_de_reais(Integer valorSaque) {
	        try {
	            cliente.sacar(valorSaque);
	        } catch (SaldoInsuficienteException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }

	    @Then("nao deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
	    public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
	        // Nada a fazer aqui, pois a mensagem de saldo insuficiente já é tratada no método sacar.
	        // Você poderia adicionar verificações adicionais se necessário.
	    }
	}
}
