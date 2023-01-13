package Datos;
// Generated 13-05-2014 06:34:34 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Reserva generated by hbm2java
 */
public class Reserva  implements java.io.Serializable {


     private int id;
     private Date fechaR;
     private Date fechaE;
     private Short diasEspera;
     private String interasado;
     private String descripcion;
     private Set agendas = new HashSet(0);

    public Reserva() {
    }

	
    public Reserva(int id, Date fechaR, Date fechaE, String interasado, String descripcion) {
        this.id = id;
        this.fechaR = fechaR;
        this.fechaE = fechaE;
        this.interasado = interasado;
        this.descripcion = descripcion;
    }
    public Reserva(int id, Date fechaR, Date fechaE, Short diasEspera, String interasado, String descripcion, Set agendas) {
       this.id = id;
       this.fechaR = fechaR;
       this.fechaE = fechaE;
       this.diasEspera = diasEspera;
       this.interasado = interasado;
       this.descripcion = descripcion;
       this.agendas = agendas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Date getFechaR() {
        return this.fechaR;
    }
    
    public void setFechaR(Date fechaR) {
        this.fechaR = fechaR;
    }
    public Date getFechaE() {
        return this.fechaE;
    }
    
    public void setFechaE(Date fechaE) {
        this.fechaE = fechaE;
    }
    public Short getDiasEspera() {
        return this.diasEspera;
    }
    
    public void setDiasEspera(Short diasEspera) {
        this.diasEspera = diasEspera;
    }
    public String getInterasado() {
        return this.interasado;
    }
    
    public void setInterasado(String interasado) {
        this.interasado = interasado;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getAgendas() {
        return this.agendas;
    }
    
    public void setAgendas(Set agendas) {
        this.agendas = agendas;
    }




}


