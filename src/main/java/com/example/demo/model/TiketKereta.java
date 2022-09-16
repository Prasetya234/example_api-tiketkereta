package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tiket_kereta")
public class TiketKereta {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "krl")
    private String krl;

    @Column(name = "departure")
    private String departure;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "start_departure")
    private Date startDate;

    @Column(name = "kode_boking")
    private String kodeBoking;

    @Column(name = "end_departure")
    private String endDeparture;

    @Column(name = "end_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "passanger_type")
    private PassagerType passagerType;

    public TiketKereta() {
    }

    public TiketKereta(String name, String krl, String departure, Date startDate, String kodeBoking, String endDeparture, Date endDate, PassagerType passagerType) {
        this.name = name;
        this.krl = krl;
        this.departure = departure;
        this.startDate = startDate;
        this.kodeBoking = kodeBoking;
        this.endDeparture = endDeparture;
        this.endDate = endDate;
        this.passagerType = passagerType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKrl() {
        return krl;
    }

    public void setKrl(String krl) {
        this.krl = krl;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getKodeBoking() {
        return kodeBoking;
    }

    public void setKodeBoking(String kodeBoking) {
        this.kodeBoking = kodeBoking;
    }

    public String getEndDeparture() {
        return endDeparture;
    }

    public void setEndDeparture(String endDeparture) {
        this.endDeparture = endDeparture;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public PassagerType getPassagerType() {
        return passagerType;
    }

    public void setPassagerType(PassagerType passagerType) {
        this.passagerType = passagerType;
    }
}
