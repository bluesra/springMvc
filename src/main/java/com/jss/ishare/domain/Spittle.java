package com.jss.ishare.domain;

import javax.persistence.*;
import java.util.Date;

//import org.apache.commons.lang3.builder.EqualsBuilder;
//import org.apache.commons.lang3.builder.HashCodeBuilder;
@Entity
public class Spittle {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private final Long id;

  @Column
  private final String message;

  @Column
  private Date postedTime;

  @ManyToOne
  @JoinColumn(name="spitter")
  private Spitter spitter;
//
//  private final Date time;
//  private Double latitude;
//  private Double longitude;

  public Spittle(String message, Date time) {
    this(null, message, time, null, null);
  }
  
  public Spittle(Long id, String message, Date time, Double longitude, Double latitude) {
    this.id = id;
    this.message = message;
//    this.time = time;
//    this.longitude = longitude;
//    this.latitude = latitude;
  }

  public long getId() {
    return id;
  }

  public String getMessage() {
    return message;
  }


  
//  @Override
//  public boolean equals(Object that) {
//    return EqualsBuilder.reflectionEquals(this, that, "id", "time");
//  }
//
//  @Override
//  public int hashCode() {
//    return HashCodeBuilder.reflectionHashCode(this, "id", "time");
//  }

  public Date getPostedTime() {
    return postedTime;
  }

  public void setPostedTime(Date postedTime) {
    this.postedTime = postedTime;
  }

  public Spitter getSpitter() {
    return spitter;
  }

  public void setSpitter(Spitter spitter) {
    this.spitter = spitter;
  }
}
