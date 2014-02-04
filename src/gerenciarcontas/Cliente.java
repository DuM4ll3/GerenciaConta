/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciarcontas;

import java.util.ArrayList;

/**
 *
 * @author Diego Oliveira Froes
 */
public class Cliente {

    private String nome;
    private String telefone;
    private ArrayList<Log> log_entrada;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Log> getLog_entrada() {
        return log_entrada;
    }

    public void setLog_entrada(ArrayList<Log> log_entrada) {
        this.log_entrada = log_entrada;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", log_entrada=" + log_entrada + '}';
    }
}
