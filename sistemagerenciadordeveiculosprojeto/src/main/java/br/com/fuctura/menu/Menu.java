package br.com.fuctura.menu;

public class Menu {

	public void menuPrincipal(String opcao) {
//		String escolha = "";
		boolean opcaoValida = false;
		while (!opcaoValida) {
			switch (opcao) {
			// Frente de Loja
			case "1": {

//			frente de loja
//			escolha = "1";
				opcaoValida = true;
			}
			// Manuteção no Cadastro
			case "2": {

//			manutenção de cadastro
//			escolha = "2";
				opcaoValida = true;
			}
			// Sair
			case "3": {

//			sair
//			escolha = "3";
				opcaoValida = true;
			}

			// Opção Inválida
			default:
				System.out.println("A opção: " + opcao + " digita é invalida");
				System.out.println("Favor digitar uma das opções do menu!");
//			throw new IllegalArgumentException("Opção digitada esta invalida: " + opcao);
			}
		}
//		return escolha;
	}

	public void menuFrenteDeLoja(String opcao) {
//		String escolha = "";
		boolean opcaoValida = false;
		boolean subOpcaoValida = false;
		String op = "";
		while (!opcaoValida) {
			switch (opcao) {
			// Gerenciar Veiculo
			case "1": {
				while (!subOpcaoValida) {
					switch (op) {
					// Consultar Veículo por Placa
					case "1": {
//				consulta veiculo por placa
//				escolha = "1";
						subOpcaoValida = true;
					}
					// Voltar para o menu superior.
					case "2": {
//				volta para menu anterior
//				escolha = "2";
						subOpcaoValida = true;
					}
					// Opção Inválida
					default:
//				opção invalida
					}
				}
				opcaoValida = true;
			}
			// Gerenciar Loja
			case "2": {
				while (!subOpcaoValida) {
					switch (op) {
					// Listar todas as Lojas
					case "1": {
//				listar todas as lojas
//				escolha = "1";
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "2": {
//				volta para menu anterior
//				escolha = "2";
						subOpcaoValida = true;
					}
					// Opção Inválida
					default:
//				opção invalida
					}
				}
				opcaoValida = true;
			}
			// Gerenciar Vendedor
			case "3": {
				while (!subOpcaoValida) {
					switch (op) {
					// Consultar Vendedor por Nome
					case "1": {
//				consultar vendedor por nome
//				escolha = "1";
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "2": {
//				volta para menu anterior
//				escolha = "2";
						subOpcaoValida = true;
					}
					// Opção Inválida
					default:
//				opção invalida
					}
				}
				opcaoValida = true;
			}
			// Gerenciar cliente
			case "4": {
				while (!subOpcaoValida) {
					switch (op) {
					// Cadastrar Cliente
					case "1": {
//				Cadastrar Cliente
//				escolha = "1";
						subOpcaoValida = true;
					}
					// Consultar Cliente por CPF
					case "2": {
//				Consultar Cliente por CPF
//				escolha = "2";
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "3": {
//				volta para menu anterior
//				escolha = "3";
						subOpcaoValida = true;
					}
					// Opção Inválida
					default:
//				opção invalida
					}
				}
				opcaoValida = true;
			}
			// Gerenciar Venda
			case "5": {
				while (!subOpcaoValida) {
					switch (op) {
					// Cadastrar Venda
					case "1": {
//				cadastrar venda
//				escolha = "1";
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "2": {
//				volta para menu anterior
//				escolha = "2";
						subOpcaoValida = true;
					}
					default:
//				opção invalida
					}
				}
				opcaoValida = true;
			}
			// Opção Inválida
			default:
//			opção invalida
			}
		}
//		return escolha;
	}

	public void menuManutencaoCadastro(String opcao) {
		boolean opcaoValida = false;
		boolean subOpcaoValida = false;
		String op = "";
		while (!opcaoValida) {
			switch (opcao) {
			// Gerenciar Veículo
			case "1": {
				while (!subOpcaoValida) {
					switch (op) {
					// Cadastrar veículo
					case "1": {
						subOpcaoValida = true;
					}
					// Excluir veículo
					case "2": {
						subOpcaoValida = true;
					}
					// Alterar dados do veículo
					case "3": {
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "4": {
						subOpcaoValida = true;
					}
					default:

					}
				}

				opcaoValida = true;
			}
			// Gerenciar Loja
			case "2": {
				while (!subOpcaoValida) {
					switch (op) {
					// Cadastrar Loja
					case "1": {
						subOpcaoValida = true;
					}
					// Excluir Loja
					case "2": {
						subOpcaoValida = true;
					}
					// Alterar dados da Loja
					case "3": {
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "4": {
						subOpcaoValida = true;
					}
					default:

					}
				}

				opcaoValida = true;
			}
			// Gerenciar Vendedor
			case "3": {
				while (!subOpcaoValida) {
					switch (op) {
					// Cadastrar Vendedor
					case "1": {
						subOpcaoValida = true;
					}
					// Excluir Vendedor
					case "2": {
						subOpcaoValida = true;
					}
					// Alterar dados do Vendedor
					case "3": {
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "4": {
						subOpcaoValida = true;
					}
					default:

					}
				}

				opcaoValida = true;
			}
			// Gerenciar Cliente
			case "4": {
				while (!subOpcaoValida) {
					switch (op) {
					// Cadastrar Cliente
					case "1": {
						subOpcaoValida = true;
					}
					// Excluir Cliente
					case "2": {
						subOpcaoValida = true;
					}
					// Alterar dados do Cliente
					case "3": {
						subOpcaoValida = true;
					}
					// Voltar para o menu superior
					case "4": {
						subOpcaoValida = true;
					}
					default:

					}
				}

				opcaoValida = true;

			}
			// Gerenciar Venda
			case "5": {
				while (!subOpcaoValida) {
					switch (op) {
					// Cadastrar Venda
					case "1": {
						subOpcaoValida = true;
					}
					// Excluir Venda
					case "2": {
						subOpcaoValida = true;
					}
					default:

					}
				}

				opcaoValida = true;

			}
			// Voltar para o menu anterior
			case "6": {

				opcaoValida = true;
			}
			default:

			}
		}

	}

}
