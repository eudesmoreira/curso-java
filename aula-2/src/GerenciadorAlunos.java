import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorAlunos extends Aluno {

	public static void main(String[] args) {
		int opcao = 0;
		while (opcao != 9) {
		
			System.out.println("1.Adicionar Novos Alunos");
			System.out.println("2. Listar os Alunos Adicionados");
			System.out.println("9. Sair do Programa");
	
			Scanner ler = new Scanner(System.in);
			int opcao = ler.nextInt();
			List<Aluno> alunos = new ArrayList();
			
			switch(opcao){
				case 1:
					System.out.println("Informe o Nome: ");
					String nome = ler.next();
					System.out.println("Informe a Idade: ");
					int idade = ler.nextInt();
					System.out.println("Informe o Documento: ");
					String documento = ler.next();
												
					Aluno dadosAluno = new Aluno();
					dadosAluno.setNome(nome);
					dadosAluno.setIdade(idade);
					dadosAluno.setDocumento(documento);
					
					alunos.add(dadosAluno);
					
					break;
				case 2:
					for(Aluno dados : alunos){ 
						System.out.print("Nome: "+dados.getNome()+" - Idade: "+dados.getIdade()+" - Documento: "+dados.getDocumento()  ); 
					}
					break;
				case 9:
					break;
			}
		}
	}
}
	





