/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.keertikeya;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author Keertikeya
 */
@Entity
@Table(name = "team", catalog = "cmpe226team4", schema = "")
@NamedQueries({
    @NamedQuery(name = "Team.findAll", query = "SELECT t FROM Team t"),
    @NamedQuery(name = "Team.findByName", query = "SELECT t FROM Team t WHERE t.name = :name"),
    @NamedQuery(name = "Team.findByLocation", query = "SELECT t FROM Team t WHERE t.location = :location"),
    @NamedQuery(name = "Team.findByMatchesPlayed", query = "SELECT t FROM Team t WHERE t.matchesPlayed = :matchesPlayed"),
    @NamedQuery(name = "Team.findByMatchesWon", query = "SELECT t FROM Team t WHERE t.matchesWon = :matchesWon"),
    @NamedQuery(name = "Team.findByMatchesLost", query = "SELECT t FROM Team t WHERE t.matchesLost = :matchesLost"),
    @NamedQuery(name = "Team.findByMatchesDrawn", query = "SELECT t FROM Team t WHERE t.matchesDrawn = :matchesDrawn"),
    @NamedQuery(name = "Team.findByWinp", query = "SELECT t FROM Team t WHERE t.winp = :winp")})
public class Team implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "Location")
    private String location;
    @Column(name = "MatchesPlayed")
    private Integer matchesPlayed;
    @Column(name = "MatchesWon")
    private Integer matchesWon;
    @Column(name = "MatchesLost")
    private Integer matchesLost;
    @Column(name = "MatchesDrawn")
    private Integer matchesDrawn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "winp")
    private BigDecimal winp;

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        Integer oldMatchesPlayed = this.matchesPlayed;
        this.matchesPlayed = matchesPlayed;
        changeSupport.firePropertyChange("matchesPlayed", oldMatchesPlayed, matchesPlayed);
    }

    public Integer getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(Integer matchesWon) {
        Integer oldMatchesWon = this.matchesWon;
        this.matchesWon = matchesWon;
        changeSupport.firePropertyChange("matchesWon", oldMatchesWon, matchesWon);
    }

    public Integer getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(Integer matchesLost) {
        Integer oldMatchesLost = this.matchesLost;
        this.matchesLost = matchesLost;
        changeSupport.firePropertyChange("matchesLost", oldMatchesLost, matchesLost);
    }

    public Integer getMatchesDrawn() {
        return matchesDrawn;
    }

    public void setMatchesDrawn(Integer matchesDrawn) {
        Integer oldMatchesDrawn = this.matchesDrawn;
        this.matchesDrawn = matchesDrawn;
        changeSupport.firePropertyChange("matchesDrawn", oldMatchesDrawn, matchesDrawn);
    }

    public BigDecimal getWinp() {
        return winp;
    }

    public void setWinp(BigDecimal winp) {
        BigDecimal oldWinp = this.winp;
        this.winp = winp;
        changeSupport.firePropertyChange("winp", oldWinp, winp);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.keertikeya.Team[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
