/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apoorv;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Magneto
 */
@Entity
@Table(name = "mess2", catalog = "university", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mess2.findAll", query = "SELECT m FROM Mess2 m"),
    @NamedQuery(name = "Mess2.findByRegNo", query = "SELECT m FROM Mess2 m WHERE m.regNo = :regNo"),
    @NamedQuery(name = "Mess2.findByBlock", query = "SELECT m FROM Mess2 m WHERE m.block = :block"),
    @NamedQuery(name = "Mess2.findByAcademicYear", query = "SELECT m FROM Mess2 m WHERE m.academicYear = :academicYear"),
    @NamedQuery(name = "Mess2.findByType", query = "SELECT m FROM Mess2 m WHERE m.type = :type")})
public class Mess2 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "reg_no")
    private String regNo;
    @Column(name = "block")
    private String block;
    @Column(name = "academic_year")
    private String academicYear;
    @Column(name = "type")
    private String type;

    public Mess2() {
    }

    public Mess2(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        String oldRegNo = this.regNo;
        this.regNo = regNo;
        changeSupport.firePropertyChange("regNo", oldRegNo, regNo);
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        String oldBlock = this.block;
        this.block = block;
        changeSupport.firePropertyChange("block", oldBlock, block);
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        String oldAcademicYear = this.academicYear;
        this.academicYear = academicYear;
        changeSupport.firePropertyChange("academicYear", oldAcademicYear, academicYear);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        String oldType = this.type;
        this.type = type;
        changeSupport.firePropertyChange("type", oldType, type);
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
        if (!(object instanceof Mess2)) {
            return false;
        }
        Mess2 other = (Mess2) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apoorv.Mess2[ regNo=" + regNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
