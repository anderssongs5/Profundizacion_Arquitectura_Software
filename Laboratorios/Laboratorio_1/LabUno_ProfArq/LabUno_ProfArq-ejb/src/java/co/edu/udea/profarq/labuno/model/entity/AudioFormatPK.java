package co.edu.udea.profarq.labuno.model.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@Embeddable
public class AudioFormatPK implements Serializable {

    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 3)
    @Column(name = "AUDIO_LANGUAGE")
    private String audioLanguage;
    @Basic(optional = false)
    @NotNull()
    @Size(min = 1, max = 3)
    @Column(name = "SUBTITLE_LANGUAGE")
    private String subtitleLanguage;

    public AudioFormatPK() {
        super();
    }

    public AudioFormatPK(String audioLanguage, String subtitleLanguage) {
        this.audioLanguage = audioLanguage;
        this.subtitleLanguage = subtitleLanguage;
    }

    public String getAudioLanguage() {

        return (this.audioLanguage);
    }

    public void setAudioLanguage(String audioLanguage) {
        this.audioLanguage = audioLanguage;
    }

    public String getSubtitleLanguage() {

        return (this.subtitleLanguage);
    }

    public void setSubtitleLanguage(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    @Override()
    public int hashCode() {
        int hash = 0;

        hash += ((this.getAudioLanguage() != null)
                ? this.getAudioLanguage().hashCode() : 0);
        hash += ((this.getSubtitleLanguage() != null)
                ? this.getSubtitleLanguage().hashCode() : 0);

        return (hash);
    }

    @Override()
    public boolean equals(Object object) {
        if (!(object instanceof AudioFormatPK)) {

            return (false);
        }

        AudioFormatPK other = (AudioFormatPK) object;
        if (((this.getAudioLanguage() == null)
                && (other.getAudioLanguage() != null))
                || ((this.getAudioLanguage() != null)
                && !(this.getAudioLanguage().equals(other.getAudioLanguage())))) {

            return (false);
        }

        if (((this.getSubtitleLanguage() == null)
                && (other.getSubtitleLanguage() != null))
                || ((this.getSubtitleLanguage() != null)
                && !(this.getSubtitleLanguage().equals(
                        other.getSubtitleLanguage())))) {

            return (false);
        }

        return (true);
    }

    @Override()
    public String toString() {

        return ("co.edu.udea.profarq.labuno.model.entity.AudioFormatPK[ audioLanguage="
                + this.audioLanguage + ", subtitleLanguage="
                + this.subtitleLanguage + " ]");
    }
}
