package cl.ubiobio.springfilm.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arrienda")
public class Arrienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArrienda;

    @Column(name = "valor")
    private double valor;

    @Column(name = "fechaEntrega")
    private Date fechaEntrega;

    @Column(name = "fechaDevolucion")
    private Date fechaDevolucion;

    public Arrienda(int idArrienda, double valor, Date fechaEntrega, Date fechaDevolucion) {
        this.idArrienda = idArrienda;
        this.valor = valor;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Arrienda() {
    }

    public int getIdArrienda() {
        return idArrienda;
    }

    public void setIdArrienda(int idArrienda) {
        this.idArrienda = idArrienda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

}
