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
@Table(name = "hosteller", catalog = "university", schema = "")
@NamedQueries({
    @NamedQuery(name = "Hosteller.findAll", query = "SELECT h FROM Hosteller h"),
    @NamedQuery(name = "Hosteller.findByType1", query = "SELECT h FROM Hosteller h WHERE h.type1 = :type1"),
    @NamedQuery(name = "Hosteller.findByType2", query = "SELECT h FROM Hosteller h WHERE h.type2 = :type2"),
    @NamedQuery(name = "Hosteller.findByRegNo", query = "SELECT h FROM Hosteller h WHERE h.regNo = :regNo"),
    @NamedQuery(name = "Hosteller.findByBlock", query = "SELECT h FROM Hosteller h WHERE h.block = :block"),
    @NamedQuery(name = "Hosteller.findByAcademicYear", query = "SELECT h FROM Hosteller h WHERE h.academicYear = :academicYear")})
public class Hosteller implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "type1")
    private String type1;
    @Column(name = "type2")
    private String type2;
    @Id
    @Basic(optional = false)
    @Column(name = "reg_no")
    private String regNo;
    @Column(name = "block")
    private String block;
    @Column(name = "academic_year")
    private String academicYear;

    public Hosteller() {
    }

    public Hosteller(String regNo) {
        this.regNo = regNo;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        String oldType1 = this.type1;
        this.type1 = type1;
        changeSupport.firePropertyChange("type1", oldType1, type1);
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        String oldType2 = this.type2;
        this.type2 = type2;
        changeSupport.firePropertyChange("type2", oldType2, type2);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regNo != null ? regNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hosteller)) {
            return false;
        }
        Hosteller other = (Hosteller) object;
        if ((this.regNo == null && other.regNo != null) || (this.regNo != null && !this.regNo.equals(other.regNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apoorv.Hosteller[ regNo=" + regNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
