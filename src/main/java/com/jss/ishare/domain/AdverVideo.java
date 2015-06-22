package com.jss.ishare.domain;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by apple on 6/22/15.
 * 广告视频
 */
@Entity
@Table(name = "ADVER_VIDEO")
public class AdverVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    String videoName;

    String videoPath;

    @Temporal(TemporalType.TIMESTAMP)
    Calendar updateDate;

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
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
