//Como queremos utilizar o scanner 	para ler os dados que o usuario vai digitar, e ele n�o � carregado por uma biblioteca, uso o import 

import java.util.Scanner;

//Esse programa deve receber o nome do usuario e exibir esse nome com uma mensagem de boas vindas


public class ProgramaNome {

	public static void main(String[] args) {
	    //A linha abaixo cria um leitor para podermos ler o teclado do usuario
		Scanner leitor = new Scanner(System.in);
		//A linha abaixo cria um espa�o na ram pra guardar dados do tipo texto
		String nome;
		
        System.out.println("Favor digite seu nome:");
        //A linha abaixo pega o texto digitado pelo usuario e guarda na variavel nome
        nome = leitor.next();
        
        //Para lermos textos com espa�os, usamos o nextline
        //nome = leitor.nextline();
        
        //Esse c�digo le um texto do teclado do usuario
        System.out.println("Que legal que o seu nome � " + nome);
        
        System.out.println(nome + ",fico feliz que voc� esteja usando o meu programa");
        
        //Apos terminar de usar o leitor, precisamos fechar
        leitor.close();
	}

}
