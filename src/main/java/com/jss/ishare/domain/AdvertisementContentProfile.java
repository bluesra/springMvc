package com.jss.ishare.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by apple on 6/22/15.
 * 广告内容集合类
 */
@Entity
@Table(name = "ADVERTISEMENT_CONTENT_PROFILE")
public class AdvertisementContentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    Set<AdverPicture> adverPictures;

    @ManyToMany
    Set<AdverVideo> adverVideos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<AdverPicture> getAdverPictures() {
        return adverPictures;
    }

    public void setAdverPictures(Set<AdverPicture> adverPictures) {
        this.adverPictures = adverPictures;
    }

    public Set<AdverVideo> getAdverVideos() {
        return adverVideos;
    }

    public void setAdverVideos(Set<AdverVideo> adverVideos) {
        this.adverVideos = adverVideos;
    }
}
