/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;



import java.util.Date;

public class Federado extends Atleta {
  private Date dataRegistoFederacao;
  private String clube;

  public Federado(String nome, String nif, String morada, String telefone, String email, Date dataNascimento, Date dataRegistoFederacao, String clube) {
    super(nome, nif, morada, telefone, email, dataNascimento);
    this.dataRegistoFederacao = dataRegistoFederacao;
    this.clube = clube;
  }

  public Date getDataRegistoFederacao() {
    return dataRegistoFederacao;
  }

  public void setDataRegistoFederacao(Date dataRegistoFederacao) {
    this.dataRegistoFederacao = dataRegistoFederacao;
  }

  public String getClube() {
    return clube;
  }

  public void setClube(String clube) {
    this.clube = clube;
  }
}
