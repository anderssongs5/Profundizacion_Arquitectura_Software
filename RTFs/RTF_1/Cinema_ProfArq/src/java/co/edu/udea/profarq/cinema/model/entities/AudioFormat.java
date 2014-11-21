package co.edu.udea.profarq.cinema.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Entity
@Table(name = "audio_format")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AudioFormat.findAll", query = "SELECT a FROM AudioFormat a"),
    @NamedQuery(name = "AudioFormat.findByAudioLanguage", query = "SELECT a FROM AudioFormat a WHERE a.audioFormatPK.audioLanguage = :audioLanguage"),
    @NamedQuery(name = "AudioFormat.findBySubtitleLanguage", query = "SELECT a FROM AudioFormat a WHERE a.audioFormatPK.subtitleLanguage = :subtitleLanguage"),
    @NamedQuery(name = "AudioFormat.findByDescription", query = "SELECT a FROM AudioFormat a WHERE a.description = :description")})
public class AudioFormat implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AudioFormatPK audioFormatPK;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "audioFormat")
    private List<Billboard> billboardList;
    @JoinColumn(name = "audio_language", referencedColumnName = "iso_code", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Languages languages;
    @JoinColumn(name = "subtitle_language", referencedColumnName = "iso_code", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Languages languages1;

    public AudioFormat() {
    }

    public AudioFormat(AudioFormatPK audioFormatPK) {
        this.audioFormatPK = audioFormatPK;
    }

    public AudioFormat(String audioLanguage, String subtitleLanguage) {
        this.audioFormatPK = new AudioFormatPK(audioLanguage, subtitleLanguage);
    }

    public AudioFormatPK getAudioFormatPK() {
        return audioFormatPK;
    }

    public void setAudioFormatPK(AudioFormatPK audioFormatPK) {
        this.audioFormatPK = audioFormatPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<Billboard> getBillboardList() {
        return billboardList;
    }

    public void setBillboardList(List<Billboard> billboardList) {
        this.billboardList = billboardList;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Languages getLanguages1() {
        return languages1;
    }

    public void setLanguages1(Languages languages1) {
        this.languages1 = languages1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (audioFormatPK != null ? audioFormatPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AudioFormat)) {
            return false;
        }
        AudioFormat other = (AudioFormat) object;
        if ((this.audioFormatPK == null && other.audioFormatPK != null) || (this.audioFormatPK != null && !this.audioFormatPK.equals(other.audioFormatPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.cinema.model.entities.AudioFormat[ audioFormatPK=" + audioFormatPK + " ]";
    }
    
}
