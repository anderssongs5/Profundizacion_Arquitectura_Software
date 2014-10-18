/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tests
 */
@Entity
@Table(name = "LANGUAGES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Languages.findAll", query = "SELECT l FROM Languages l"),
    @NamedQuery(name = "Languages.findByIsoCode", query = "SELECT l FROM Languages l WHERE l.isoCode = :isoCode"),
    @NamedQuery(name = "Languages.findByLanguageName", query = "SELECT l FROM Languages l WHERE l.languageName = :languageName")})
public class Languages implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ISO_CODE")
    private String isoCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "LANGUAGE_NAME")
    private String languageName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "languages")
    private List<AudioFormat> audioFormatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "languages1")
    private List<AudioFormat> audioFormatList1;

    public Languages() {
    }

    public Languages(String isoCode) {
        this.isoCode = isoCode;
    }

    public Languages(String isoCode, String languageName) {
        this.isoCode = isoCode;
        this.languageName = languageName;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    @XmlTransient
    public List<AudioFormat> getAudioFormatList() {
        return audioFormatList;
    }

    public void setAudioFormatList(List<AudioFormat> audioFormatList) {
        this.audioFormatList = audioFormatList;
    }

    @XmlTransient
    public List<AudioFormat> getAudioFormatList1() {
        return audioFormatList1;
    }

    public void setAudioFormatList1(List<AudioFormat> audioFormatList1) {
        this.audioFormatList1 = audioFormatList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isoCode != null ? isoCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Languages)) {
            return false;
        }
        Languages other = (Languages) object;
        if ((this.isoCode == null && other.isoCode != null) || (this.isoCode != null && !this.isoCode.equals(other.isoCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.labuno.model.entity.Languages[ isoCode=" + isoCode + " ]";
    }
    
}
