package entities;

public class Programa {

	public static void main(String[] args) {

		Pessoas pessoaNormal = new PessoaFisica();

		pessoaNormal.setNome("luiz");
		pessoaNormal.setGenero("Masc");
		pessoaNormal.setCpf("138.571.853.34");
		if (pessoaNormal instanceof PessoaFisica) {
			((PessoaFisica) pessoaNormal).setRg("5454656565");
		}
		System.out.print(pessoaNormal.getNome() + " é do genero " + pessoaNormal.getGenero() + "e o seu cpf é: "
				+ pessoaNormal.getCpf());
		if (pessoaNormal instanceof PessoaFisica) {
			System.out.println(" e seu rg é: " + ((PessoaFisica) pessoaNormal).getRg());
		}

		Pessoas pessoa = new PessoaJuridica();
		pessoa.setNome("Isa");
		pessoa.setGenero("Fem");
		pessoa.setCpf("123.765.431.45");
		if (pessoa instanceof PessoaJuridica) {
			((PessoaJuridica) pessoa).setCnpj("23.432.654/0001-12");
			System.out.print(pessoa.getNome() + " é do genero " + pessoa.getGenero() + " e o seu cpf é: "
					+ pessoa.getCpf());
			if (pessoa instanceof PessoaJuridica) {
				System.out.println(" e seu cnpj é: " + ((PessoaJuridica) pessoa).getCnpj());
			}
		}

	}
}
