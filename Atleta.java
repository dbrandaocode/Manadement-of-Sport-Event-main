package trab1;
import java.util.Date;

public class Atleta {
  private String nome;
  private String nif;
  private String morada;
  private String telefone;
  private String email;
  private Date dataNascimento;

  public Atleta(String nome, String nif, String morada, String telefone, String email, Date dataNascimento) {
    this.nome = nome;
    this.nif = nif;
    this.morada = morada;
    this.telefone = telefone;
    this.email = email;
    this.dataNascimento = dataNascimento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNif() {
    return nif;
  }

  public void setNif(String nif) {
    this.nif = nif;
  }

  public String getMorada() {
    return morada;
  }

  public void setMorada(String morada) {
    this.morada = morada;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(Date dataNascimento) {
    this.dataNascimento = dataNascimento;
  }
}