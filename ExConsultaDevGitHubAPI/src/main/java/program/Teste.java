package program;

import java.io.IOException;
import java.util.Scanner;

import model.Perfil;
import service.GitHubService;

public class Teste {

	public static void main(String[] args) {
		GitHubService githubservice = new GitHubService();
		
		Scanner ler = new Scanner(System.in);
		
		String login;
		
		System.out.print("Digite o login do GitHub da pessoa: ");
		login = ler.next();
		

		try {
			Perfil perfil = githubservice.getPerfil(login);
			
			System.out.println("Nome: " + perfil.getName() + "\n");
			System.out.println("Qtd. Repositórios: " + perfil.getPublic_repos() + "\n");
			System.out.println("Qtd. Seguidores: " + perfil.getFollowers()  + "\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
