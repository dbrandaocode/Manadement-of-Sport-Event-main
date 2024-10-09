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

public class NaoFederado extends Atleta {
  private boolean Saude;

  public NaoFederado(String nome, String nif, String morada, String telefone, String email, Date dataNascimento, boolean confirmacaoPessoalDeSaude) {
    super(nome, nif, morada, telefone, email, dataNascimento);
    this.Saude = confirmacaoPessoalDeSaude;
  }

  public boolean Saude() {
    return Saude;
  }

  public void Saude(boolean Saude) {
    this.Saude = Saude;
  }
}