package Principal;


import java.util.Date;
import java.util.Map;
import trab1.Atleta;
import trab1.Federado;
import trab1.Inscricao;
import trab1.NaoFederado;
import trab1.Prova;

public class Principal {
  public static void main(String[] args) {
    // Criar atletas
    Atleta atleta1 = new Atleta("Nuno", "123456789", "Rua 1", "123456789", "@email.com", new Date(2022, 10, 10));
    Atleta atleta2 = new Atleta("Carlos", "987654321", "Rua 2", "987654321", "Carlos@email.com", new Date(2022, 5, 30));
    Atleta atleta3 = new Atleta("RUI", "987654321", "Rua 3", "987654311", "Rui@email.com", new Date(2022, 5, 30));

    Federado federado1 = new Federado(atleta1.getNome(), atleta1.getNif(), atleta1.getMorada(), atleta1.getTelefone(), atleta1.getEmail(), atleta1.getDataNascimento(), new Date(2018, 0, 1), "FC Porto");
    Federado federado2 = new Federado(atleta2.getNome(), atleta2.getNif(), atleta2.getMorada(), atleta2.getTelefone(), atleta2.getEmail(), atleta2.getDataNascimento(), new Date(2018, 0, 1), "SL Benfica");

    // Criar atletas não federados
    NaoFederado naoFederado1 = new NaoFederado(atleta3.getNome(), atleta3.getNif(), atleta3.getMorada(), atleta3.getTelefone(), atleta3.getEmail(), atleta3.getDataNascimento(), true);
   
    // Criar prova
    Date dataHora = new Date(2020, 11, 5, 10, 0);
    Prova prova = new Prova("Prova 1", "Maratona", "Cidade 1", dataHora, 300.0);

    // Adicionar inscrições
    prova.addInscFederada(federado1);
    prova.addInscFederada(federado2);
    prova.addInscNaoFederada(naoFederado1);
    

    // Remover inscrição
    Inscricao inscricao = prova.getInscricoes().get(1);
    prova.removerInscricao(inscricao);
    
 

    // Calcular total faturado
    double totalFaturado = prova.calcularTotalFaturado();

    System.out.println("Nome Federado: " + federado1.getNome());
    System.out.println("Clube Federado: " + federado1.getClube());
     System.out.println("Nome Federado: " + federado2.getNome());
     
     System.out.println("Clube: " + federado2.getClube());
     System.out.println("Nome de atleta nao federado: " + naoFederado1.getNome());
     System.out.println("Confirmacao da saude: " + naoFederado1.Saude());
    System.out.println("Data: " + prova.getDataHora());
    System.out.println("Preço de inscrição: " + prova.getprecoInscricao());
    System.out.println("Designação: " + prova.getDesignacao());
    System.out.println("Modalidade: " + prova.getModalidade());
    System.out.println("Local: " + prova.getLocal());
    System.out.println("Total faturado: " + totalFaturado);
    
  }
}