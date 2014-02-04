/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciarcontas;

/**
 *
 * @author Diego Oliveira Froes
 */
public class Log {

    private String secao;
    private String data;
    private String hora;
    private String origem_uf_destino;
    private String numero;
    private String duracao_quantidade;
    private int tarifa;
    private int valor;
    private int valor_cobrado;
    private String sub_secao;
    private int imposto;
    private String descricao;
    private String cargo;

    public Log(String secao, String data, String hora, String origem_uf_destino, String numero, String duracao_quantidade, int tarifa, int valor, int valor_cobrado, String sub_secao, int imposto, String descricao, String cargo) {
        this.secao = secao;
        this.data = data;
        this.hora = hora;
        this.origem_uf_destino = origem_uf_destino;
        this.numero = numero;
        this.duracao_quantidade = duracao_quantidade;
        this.tarifa = tarifa;
        this.valor = valor;
        this.valor_cobrado = valor_cobrado;
        this.sub_secao = sub_secao;
        this.imposto = imposto;
        this.descricao = descricao;
        this.cargo = cargo;
    }

    public Log() {
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigem_uf_destino() {
        return origem_uf_destino;
    }

    public void setOrigem_uf_destino(String origem_uf_destino) {
        this.origem_uf_destino = origem_uf_destino;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDuracao_quantidade() {
        return duracao_quantidade;
    }

    public void setDuracao_quantidade(String duracao_quantidade) {
        this.duracao_quantidade = duracao_quantidade;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor_cobrado() {
        return valor_cobrado;
    }

    public void setValor_cobrado(int valor_cobrado) {
        this.valor_cobrado = valor_cobrado;
    }

    public String getSub_secao() {
        return sub_secao;
    }

    public void setSub_secao(String sub_secao) {
        this.sub_secao = sub_secao;
    }

    public int getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Log{" + "secao=" + secao + ", data=" + data + ", hora=" + hora + ", origem_uf_destino=" + origem_uf_destino + ", numero=" + numero + ", duracao_quantidade=" + duracao_quantidade + ", tarifa=" + tarifa + ", valor=" + valor + ", valor_cobrado=" + valor_cobrado + ", sub_secao=" + sub_secao + ", imposto=" + imposto + ", descricao=" + descricao + ", cargo=" + cargo + '}';
    }
}
