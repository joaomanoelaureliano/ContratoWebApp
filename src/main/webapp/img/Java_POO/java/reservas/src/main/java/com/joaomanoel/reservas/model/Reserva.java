package com.joaomanoel.reservas.model;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "RESERVAS")
@SequenceGenerator(name = "RESERVAS_SEQ", allocationSize = 1)
public class Reserva {
    @Id
    @Column (name = "ID_RESERVAS")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "RESERVAS_SEQ")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "ID_VEICULO", referencedColumnName = "ID")
    private Veiculo veiculo;
    
    @JoinColumn(name = "ID_PESSOA", referencedColumnName = "ID")
    private Pessoa pessoa;
    
    @Column(name = "DT_SAIDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtSaida;
    
    @Column(name = "DT_RETORNO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtRetorno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public Date getDtRetorno() {
        return dtRetorno;
    }

    public void setDtRetorno(Date dtRetorno) {
        this.dtRetorno = dtRetorno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.veiculo);
        hash = 73 * hash + Objects.hashCode(this.pessoa);
        hash = 73 * hash + Objects.hashCode(this.dtSaida);
        hash = 73 * hash + Objects.hashCode(this.dtRetorno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reserva other = (Reserva) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.veiculo, other.veiculo)) {
            return false;
        }
        if (!Objects.equals(this.pessoa, other.pessoa)) {
            return false;
        }
        if (!Objects.equals(this.dtSaida, other.dtSaida)) {
            return false;
        }
        if (!Objects.equals(this.dtRetorno, other.dtRetorno)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", veiculo=" + veiculo + ", pessoa=" + pessoa + ", dtSaida=" + dtSaida + ", dtRetorno=" + dtRetorno + '}';
    }
    
}
