/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Tests
 */
@Embeddable
public class AudioFormatPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "AUDIO_LANGUAGE")
    private String audioLanguage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "SUBTITLE_LANGUAGE")
    private String subtitleLanguage;

    public AudioFormatPK() {
    }

    public AudioFormatPK(String audioLanguage, String subtitleLanguage) {
        this.audioLanguage = audioLanguage;
        this.subtitleLanguage = subtitleLanguage;
    }

    public String getAudioLanguage() {
        return audioLanguage;
    }

    public void setAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
    }

    public String getSubtitleLanguage() {
        return subtitleLanguage;
    }

    public void setSubtitleLanguage(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (audioLanguage != null ? audioLanguage.hashCode() : 0);
        hash += (subtitleLanguage != null ? subtitleLanguage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AudioFormatPK)) {
            return false;
        }
        AudioFormatPK other = (AudioFormatPK) object;
        if ((this.audioLanguage == null && other.audioLanguage != null) || (this.audioLanguage != null && !this.audioLanguage.equals(other.audioLanguage))) {
            return false;
        }
        if ((this.subtitleLanguage == null && other.subtitleLanguage != null) || (this.subtitleLanguage != null && !this.subtitleLanguage.equals(other.subtitleLanguage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.labuno.model.entity.AudioFormatPK[ audioLanguage=" + audioLanguage + ", subtitleLanguage=" + subtitleLanguage + " ]";
    }
    
}
