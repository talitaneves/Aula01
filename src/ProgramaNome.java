//Como queremos utilizar o scanner 	para ler os dados que o usuario vai digitar, e ele não é carregado por uma biblioteca, uso o import 

import java.util.Scanner;

//Esse programa deve receber o nome do usuario e exibir esse nome com uma mensagem de boas vindas


public class ProgramaNome {

	public static void main(String[] args) {
	    //A linha abaixo cria um leitor para podermos ler o teclado do usuario
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo cria um espaço na ram pra guardar dados do tipo texto
		String nome;
		
        System.out.println("Favor digite seu nome:");
        //A linha abaixo pega o texto digitado pelo usuario e guarda na variavel nome
        nome = leitor.next();
        
        //Para lermos textos com espaços, usamos o nextline
        //nome = leitor.nextline();
        
        //Esse código le um texto do teclado do usuario
        System.out.println("Que legal que o seu nome é " + nome);
        
        System.out.println(nome + ",fico feliz que você esteja usando o meu programa");
        
        //Apos terminar de usar o leitor, precisamos fechar
        leitor.close();
	}

}
