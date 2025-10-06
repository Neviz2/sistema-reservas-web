package br.com.agenciaviagens.sistema_reservas_web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;


public class Reserva {
    @Id
    private String id;
    private String cliente;
    private String pacote;
    private Double valor;
    private LocalDate dataSaida;
    private String status;

    public Reserva() {
    }

    public Reserva(String id, String cliente, String pacote, Double valor, LocalDate dataSaida, String status) {
        this.id = id;
        this.cliente = cliente;
        this.pacote = pacote;
        this.valor = valor;
        this.dataSaida = dataSaida;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}