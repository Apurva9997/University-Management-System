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
@Table(name = "student", catalog = "university", schema = "")
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByName", query = "SELECT s FROM Student s WHERE s.name = :name"),
    @NamedQuery(name = "Student.findByContact", query = "SELECT s FROM Student s WHERE s.contact = :contact"),
    @NamedQuery(name = "Student.findByBranch", query = "SELECT s FROM Student s WHERE s.branch = :branch"),
    @NamedQuery(name = "Student.findByDob", query = "SELECT s FROM Student s WHERE s.dob = :dob"),
    @NamedQuery(name = "Student.findByNationality", query = "SELECT s FROM Student s WHERE s.nationality = :nationality"),
    @NamedQuery(name = "Student.findByGender", query = "SELECT s FROM Student s WHERE s.gender = :gender"),
    @NamedQuery(name = "Student.findByEmail", query = "SELECT s FROM Student s WHERE s.email = :email"),
    @NamedQuery(name = "Student.findByAddress", query = "SELECT s FROM Student s WHERE s.address = :address"),
    @NamedQuery(name = "Student.findByStudentReg", query = "SELECT s FROM Student s WHERE s.studentReg = :studentReg"),
    @NamedQuery(name = "Student.findByFatherName", query = "SELECT s FROM Student s WHERE s.fatherName = :fatherName"),
    @NamedQuery(name = "Student.findByFatherQualification", query = "SELECT s FROM Student s WHERE s.fatherQualification = :fatherQualification"),
    @NamedQuery(name = "Student.findByFatherContact", query = "SELECT s FROM Student s WHERE s.fatherContact = :fatherContact"),
    @NamedQuery(name = "Student.findByMotherName", query = "SELECT s FROM Student s WHERE s.motherName = :motherName"),
    @NamedQuery(name = "Student.findByMotherQualification", query = "SELECT s FROM Student s WHERE s.motherQualification = :motherQualification"),
    @NamedQuery(name = "Student.findByMotherContact", query = "SELECT s FROM Student s WHERE s.motherContact = :motherContact"),
    @NamedQuery(name = "Student.findBySchool", query = "SELECT s FROM Student s WHERE s.school = :school"),
    @NamedQuery(name = "Student.findByBoardName", query = "SELECT s FROM Student s WHERE s.boardName = :boardName"),
    @NamedQuery(name = "Student.findByIntermediateScore", query = "SELECT s FROM Student s WHERE s.intermediateScore = :intermediateScore"),
    @NamedQuery(name = "Student.findByYearOfPassing", query = "SELECT s FROM Student s WHERE s.yearOfPassing = :yearOfPassing")})
public class Student implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    private String name;
    @Column(name = "contact")
    private String contact;
    @Column(name = "branch")
    private String branch;
    @Column(name = "dob")
    private String dob;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "gender")
    private String gender;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Id
    @Basic(optional = false)
    @Column(name = "student_reg")
    private String studentReg;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "father_qualification")
    private String fatherQualification;
    @Column(name = "father_contact")
    private String fatherContact;
    @Column(name = "mother_name")
    private String motherName;
    @Column(name = "mother_qualification")
    private String motherQualification;
    @Column(name = "mother_contact")
    private String motherContact;
    @Column(name = "school")
    private String school;
    @Column(name = "board_name")
    private String boardName;
    @Column(name = "intermediate_score")
    private String intermediateScore;
    @Column(name = "year_of_passing")
    private String yearOfPassing;

    public Student() {
    }

    public Student(String studentReg) {
        this.studentReg = studentReg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        String oldBranch = this.branch;
        this.branch = branch;
        changeSupport.firePropertyChange("branch", oldBranch, branch);
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        String oldDob = this.dob;
        this.dob = dob;
        changeSupport.firePropertyChange("dob", oldDob, dob);
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        String oldNationality = this.nationality;
        this.nationality = nationality;
        changeSupport.firePropertyChange("nationality", oldNationality, nationality);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getStudentReg() {
        return studentReg;
    }

    public void setStudentReg(String studentReg) {
        String oldStudentReg = this.studentReg;
        this.studentReg = studentReg;
        changeSupport.firePropertyChange("studentReg", oldStudentReg, studentReg);
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        String oldFatherName = this.fatherName;
        this.fatherName = fatherName;
        changeSupport.firePropertyChange("fatherName", oldFatherName, fatherName);
    }

    public String getFatherQualification() {
        return fatherQualification;
    }

    public void setFatherQualification(String fatherQualification) {
        String oldFatherQualification = this.fatherQualification;
        this.fatherQualification = fatherQualification;
        changeSupport.firePropertyChange("fatherQualification", oldFatherQualification, fatherQualification);
    }

    public String getFatherContact() {
        return fatherContact;
    }

    public void setFatherContact(String fatherContact) {
        String oldFatherContact = this.fatherContact;
        this.fatherContact = fatherContact;
        changeSupport.firePropertyChange("fatherContact", oldFatherContact, fatherContact);
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        String oldMotherName = this.motherName;
        this.motherName = motherName;
        changeSupport.firePropertyChange("motherName", oldMotherName, motherName);
    }

    public String getMotherQualification() {
        return motherQualification;
    }

    public void setMotherQualification(String motherQualification) {
        String oldMotherQualification = this.motherQualification;
        this.motherQualification = motherQualification;
        changeSupport.firePropertyChange("motherQualification", oldMotherQualification, motherQualification);
    }

    public String getMotherContact() {
        return motherContact;
    }

    public void setMotherContact(String motherContact) {
        String oldMotherContact = this.motherContact;
        this.motherContact = motherContact;
        changeSupport.firePropertyChange("motherContact", oldMotherContact, motherContact);
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        String oldSchool = this.school;
        this.school = school;
        changeSupport.firePropertyChange("school", oldSchool, school);
    }

    public String getBoardName() {
        return boardName;
    }

    public void setBoardName(String boardName) {
        String oldBoardName = this.boardName;
        this.boardName = boardName;
        changeSupport.firePropertyChange("boardName", oldBoardName, boardName);
    }

    public String getIntermediateScore() {
        return intermediateScore;
    }

    public void setIntermediateScore(String intermediateScore) {
        String oldIntermediateScore = this.intermediateScore;
        this.intermediateScore = intermediateScore;
        changeSupport.firePropertyChange("intermediateScore", oldIntermediateScore, intermediateScore);
    }

    public String getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(String yearOfPassing) {
        String oldYearOfPassing = this.yearOfPassing;
        this.yearOfPassing = yearOfPassing;
        changeSupport.firePropertyChange("yearOfPassing", oldYearOfPassing, yearOfPassing);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentReg != null ? studentReg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentReg == null && other.studentReg != null) || (this.studentReg != null && !this.studentReg.equals(other.studentReg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apoorv.Student[ studentReg=" + studentReg + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
