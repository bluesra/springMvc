package com.jss.ishare.domain;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by apple on 6/22/15.
 * 广告图片
 */
@Entity
@Table(name = "ADVER_PICTURE")
public class AdverPicture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String picName;

    String picPath;

    @Temporal(TemporalType.TIMESTAMP)
    Calendar updateDate;

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Calendar getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Calendar updateDate) {
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
