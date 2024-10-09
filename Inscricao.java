/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;

import java.util.Date;


/**
 *
 * @author teste
 */
public class Inscricao {
  private final Atleta atleta;
  private final Prova prova;
  private final Date dataInscricao;

  public Inscricao(Atleta atleta, Prova prova) {
    this.atleta = atleta;
    this.prova = prova;
    this.dataInscricao = new Date();
  }

  public Atleta getAtleta() {
    return this.atleta;
  }

  public Prova getProva() {
    return this.prova;
  }

  public Date getDataInscricao() {
    return this.dataInscricao;
  }
  
  
}