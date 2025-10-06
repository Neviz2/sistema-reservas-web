package br.com.agenciaviagens.sistema_reservas_web.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field; // <-- IMPORT ADICIONADO
import java.time.LocalDate;

@Document(collection = "reservas")
public class Reserva {

    @Id
    private String id;
    private String cliente;
    private String pacote;
    private Double valor;

    @Field("data_saida") // <-- CORREÇÃO PRINCIPAL: Mapeia para o nome do campo no banco
    private LocalDate dataSaida;
    
    private String status;

    // Construtor vazio (essencial para o Spring)
    public Reserva() {
    }

    // Getters e Setters para TODOS os campos

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

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", cliente=" + cliente + ", pacote=" + pacote + ", valor=" + valor + ", dataSaida="
                + dataSaida + ", status=" + status + "]";
    }
}