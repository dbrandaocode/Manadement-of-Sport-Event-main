package trab1;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import trab1.Federado;
import trab1.Inscricao;
import trab1.NaoFederado;

/**
 *
 * @author José Nuno Marinho Carvalho a48542 Engenharia Informática
 *         Herculano Jacob Kapaia Taca a48534 Engenharia Informática
 * 
 */


public class Prova {
  private final String designacao;
  private final String modalidade;
  private String local;
  private Date dataHora;
  private double precoInscricao;
  private List<Inscricao> inscricoes;

  public Prova(String designacao, String modalidade, String local, Date dataHora, double precoInscricao) {
    this.designacao = designacao;
    this.modalidade = modalidade;
    this.local = local;
    this.dataHora = dataHora;
    this.precoInscricao = precoInscricao;
    this.inscricoes = new ArrayList<Inscricao>();
  }

  public List<Inscricao> getInscricoes() {
    return inscricoes;
  }
  
  public void addInscFederada(Federado federado) {
    Inscricao inscricao = new Inscricao(federado, this);
    this.inscricoes.add(inscricao);
  }

    /**
     *
     * @param naoFederado
     */
    public void addInscNaoFederada(NaoFederado naoFederado) {
    Inscricao inscricao = new Inscricao(naoFederado, this);
    this.inscricoes.add(inscricao);
  }
  
  

  public void removerInscricao(Inscricao inscricao) {
    this.inscricoes.remove(inscricao);
    
  }

  public double calcularTotalFaturado() {
    double totalFaturado = 0.0;

    for (Inscricao inscricao : this.inscricoes) {
      Date dataInscricao = inscricao.getDataInscricao();
      long dias = this.calcularDiferencaEntreDatasEmDias(dataInscricao, this.dataHora);

      if (dias <= 7) {
        totalFaturado += this.precoInscricao * 0.9;
      } else if (dias <= 3) {
        totalFaturado += this.precoInscricao * 0.95;
      } else {
        totalFaturado += this.precoInscricao;
      }
    }

    return totalFaturado;
  }

  private long calcularDiferencaEntreDatasEmDias(Date data1, Date data2) {
    long diferencaEmMilissegundos = data2.getTime() - data1.getTime();
    long diferencaEmDias = TimeUnit.DAYS.convert(diferencaEmMilissegundos, TimeUnit.MILLISECONDS);
    return diferencaEmDias;
  }
  
  public String getDesignacao() {
    return designacao;
  }

  public String getModalidade() {
    return modalidade;
  }

  public String getLocal() {
    return local;
  }

    public double getprecoInscricao() {
     return precoInscricao;
    }

    public Date getDataHora() {
       return dataHora;
    }
 
}

