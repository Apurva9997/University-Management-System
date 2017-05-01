/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apoorv;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Magneto
 */
@Entity
@Table(name = "leav", catalog = "university", schema = "")
@NamedQueries({
    @NamedQuery(name = "Leav.findAll", query = "SELECT l FROM Leav l"),
    @NamedQuery(name = "Leav.findByRegNo", query = "SELECT l FROM Leav l WHERE l.regNo = :regNo"),
    @NamedQuery(name = "Leav.findByAa", query = "SELECT l FROM Leav l WHERE l.aa = :aa"),
    @NamedQuery(name = "Leav.findByType", query = "SELECT l FROM Leav l WHERE l.type = :type"),
    @NamedQuery(name = "Leav.findByFrom", query = "SELECT l FROM Leav l WHERE l.from = :from"),
    @NamedQuery(name = "Leav.findByTo", query = "SELECT l FROM Leav l WHERE l.to = :to"),
    @NamedQuery(name = "Leav.findByPlaceAddress", query = "SELECT l FROM Leav l WHERE l.placeAddress = :placeAddress"),
    @NamedQuery(name = "Leav.findByReason", query = "SELECT l FROM Leav l WHERE l.reason = :reason")})
public class Leav implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "reg_no")
    private String regNo;
    @Column(name = "Aa")
    private String aa;
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Column(name = "_from")
    @Temporal(TemporalType.DATE)
    private Date from;
    @Basic(optional = false)
    @Column(name = "_to")
    @Temporal(TemporalType.DATE)
    private Date to;
    @Column(name = "place_address")
    private String placeAddress;
    @Column(name = "reason")
    private String reason;

    public Leav() {
    }

    public Leav(String regNo) {
        this.regNo = regNo;
    }

    public Leav(String regNo, Date from, Date to) {
        this.regNo = regNo;
        this.from = from;
        this.to = to;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        String oldRegNo = this.regNo;
        this.regNo = regNo;
        changeSupport.firePropertyChange("regNo", oldRegNo, regNo);
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        String oldAa = this.aa;
        this.aa = aa;
        changeSupport.firePropertyChange("aa", oldAa, aa);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        Date oldFrom = this.from;
        this.from = from;
        changeSupport.firePropertyChange("from", oldFrom, from);
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        Date oldTo = this.to;
        this.to = to;
        changeSupport.firePropertyChange("to", oldTo, to);
    }

    public String getPlaceAddress() {
        return placeAddress;
    }

    public void setPlaceAddress(String placeAddress) {
        String oldPlaceAddress = this.placeAddress;
        this.placeAddress = placeAddress;
        changeSupport.firePropertyChange("placeAddress", oldPlaceAddress, placeAddress);
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        String oldReason = this.reason;
        this.reason = reason;
        changeSupport.firePropertyChange("reason", oldReason, reason);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regNo != null ? regNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leav)) {
            return false;
        }
        Leav other = (Leav) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apoorv.Leav[ regNo=" + regNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
