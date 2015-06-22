package com.jss.ishare.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Jack Yang on 6/22/15.
 * 广告方案 － 设备，播放的内容，时间
 */
@Entity
@Table(name = "ADVER_PLAN_PROFILE")
public class AdvertisementPlanProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String profileName;

    @ManyToOne
    AndroidDevice androidDevice;

    @ManyToOne
    AdvertisementContentProfile advertisementContentProfile;

    @OneToMany
    Set<SharedTime> sharedTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public AndroidDevice getAndroidDevice() {
        return androidDevice;
    }

    public void setAndroidDevice(AndroidDevice androidDevice) {
        this.androidDevice = androidDevice;
    }

    public AdvertisementContentProfile getAdvertisementContentProfile() {
        return advertisementContentProfile;
    }

    public void setAdvertisementContentProfile(AdvertisementContentProfile advertisementContentProfile) {
        this.advertisementContentProfile = advertisementContentProfile;
    }

    public Set<SharedTime> getSharedTimes() {
        return sharedTimes;
    }

    public void setSharedTimes(Set<SharedTime> sharedTimes) {
        this.sharedTimes = sharedTimes;
    }
}
