package com.example.demo.dto;

public class TiketKeretaDTO {
    private String name;
    private String krl;
    private String departure;
    private String endDeparture;

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

    public String getEndDeparture() {
        return endDeparture;
    }

    public void setEndDeparture(String endDeparture) {
        this.endDeparture = endDeparture;
    }
}
