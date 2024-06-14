import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*MENU

1 - Cadastrar

2 - Listar

3 - Listar por altura decrescente

4 - Remover

5 - Pesquisar por apelido

6 - Sair*/
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome;
    String apelido;
    String data;
    String posicao;
    double altura;

    TreeSet<Atleta> ArvoreAtleta = new TreeSet<Atleta>();
    System.out.println("Digite o numero de atletas de voleyball que deseja cadastrar: ");
    int atletas = teclado.nextInt();
    teclado.nextLine();
    for (int i = 0; i < atletas; i++) {
      System.out.println("Nome: ");
      nome=teclado.nextLine();
      System.out.println("apelido: ");
      apelido = teclado.nextLine();
      System.out.println("data de nascimento: ");
      data = teclado.nextLine();
      System.out.println("Posicao: ");
      posicao= teclado.nextLine();
      System.out.println("Altura do atleta: ");
      altura= teclado.nextDouble();
      teclado.nextLine();
      if (!ArvoreAtleta.add(new Atleta( nome,  apelido,  data,  posicao,  altura))) {
        System.out.println("Atleta de voleyball ja cadastrado!");
      }
    }


    ArrayList<Atleta> listaOrdenada = new ArrayList<>(ArvoreAtleta);

    Collections.sort(listaOrdenada, new Comparator<Atleta>() {
        @Override
        public int compare(Atleta atleta1, Atleta atleta2) {
            return Double.compare(atleta2.getAltura(), atleta1.getAltura());
        }
    });

    
    for (Atleta atleta : listaOrdenada) {
        System.out.println(atleta);
    }
    System.out.println("Deseja remover algum atleta? \n Digite 1 para sim e 2 para não:");
    int op = teclado.nextInt();
    teclado.nextLine();
    if(op == 2){
      try (BufferedWriter writer = new BufferedWriter(new FileWriter("atletas.csv"))) {
          writer.write("Nome,Apelido,Data de Nascimento,Posicao, Altura\n");
          for (Atleta atleta : listaOrdenada) {
              writer.write(atleta.getNome() + "," + atleta.getApelido() + ","
                      + atleta.getData() + "," + atleta.getPosicao() +","+atleta.getAltura() +"\n");
          }
          System.out.println("Dados salvos com sucesso em atletas.csv");
      } catch (IOException e) {
          System.err.println("Erro ao escrever arquivo CSV: " + e.getMessage());
      }
    }
    while(op != 2){
      System.out.println("Digite o nome de telefone do atleta que deseja remover:");
      String Remover = teclado.nextLine();

      boolean removido = false;
      for (Atleta atleta : ArvoreAtleta) {
          if (atleta.getNome().equals(Remover)) {
              ArvoreAtleta.remove(atleta);
              removido = true;
              break;
          }
      }

      if (removido) {
          System.out.println("Atleta removido com sucesso.");
      } else {
          System.out.println("Atleta não encontrado.");
      }
      System.out.println("Deseja remover mais algum atleta? \nDigite 1 para sim e 2 para não:");
      op = teclado.nextInt();
      teclado.nextLine();
    }     

    ArrayList<Atleta> listaOrdenada2 = new ArrayList<>(ArvoreAtleta);
    for (Atleta atleta : listaOrdenada2) {
        System.out.println(atleta);
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("atletas.csv"))) {
    	writer.write("Nome,Apelido,Data de Nascimento,Posicao, Altura\n");
        for (Atleta atleta : listaOrdenada) {
            writer.write(atleta.getNome() + "," + atleta.getApelido() + ","
                    + atleta.getData() + "," + atleta.getPosicao() +","+atleta.getAltura() +"\n");
        }
      System.out.println("Dados salvos com sucesso em atletas.csv");
    } catch (IOException e) {
      System.err.println("Erro ao escrever arquivo CSV: " + e.getMessage());
    }
    
    System.out.println("Digite o apelido do atleta que deseja mostrar");
    String ape = teclado.nextLine();
    for (Atleta atleta : listaOrdenada2) {
        if (ape.equals(atleta.getApelido())) { 
            System.out.println(atleta);
        }
    }

    teclado.close();
    return;
  }
}
