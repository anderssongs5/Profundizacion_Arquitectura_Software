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
public class VideoFormatPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "DIMENSION")
    private String dimension;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "MEAN")
    private String mean;

    public VideoFormatPK() {
    }

    public VideoFormatPK(String dimension, String mean) {
        this.dimension = dimension;
        this.mean = mean;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dimension != null ? dimension.hashCode() : 0);
        hash += (mean != null ? mean.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VideoFormatPK)) {
            return false;
        }
        VideoFormatPK other = (VideoFormatPK) object;
        if ((this.dimension == null && other.dimension != null) || (this.dimension != null && !this.dimension.equals(other.dimension))) {
            return false;
        }
        if ((this.mean == null && other.mean != null) || (this.mean != null && !this.mean.equals(other.mean))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.profarq.labuno.model.entity.VideoFormatPK[ dimension=" + dimension + ", mean=" + mean + " ]";
    }
    
}
