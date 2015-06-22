package com.jss.ishare.domain;

import javax.persistence.*;

/**
 * Created by Jack Yang on 6/22/15.
 */
@Entity
@Table(name = "SHARED_TIME")
public class SharedTime {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long startTime;

    private Long endTime;

    private Integer reserveTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getReserveTimes() {
        return reserveTimes;
    }

    public void setReserveTimes(Integer reserveTimes) {
        this.reserveTimes = reserveTimes;
    }
}
