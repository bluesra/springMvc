package com.jss.ishare.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by Jack Yang on 6/22/15.
 */
@Entity
@Table(name = "ANDROID_DEVICE")
public class AndroidDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String deviceName;

    String deviceSN;

    @ElementCollection
    List<String> devicePic;

    @ManyToOne
    Address deviceAddress;

    @ManyToMany
    Set<SharedTime> sharedTimes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceSN() {
        return deviceSN;
    }

    public void setDeviceSN(String deviceSN) {
        this.deviceSN = deviceSN;
    }

    public List<String> getDevicePic() {
        return devicePic;
    }

    public void setDevicePic(List<String> devicePic) {
        this.devicePic = devicePic;
    }

    public Address getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(Address deviceAddress) {
        this.deviceAddress = deviceAddress;
    }

    public Set<SharedTime> getSharedTimes() {
        return sharedTimes;
    }

    public void setSharedTimes(Set<SharedTime> sharedTimes) {
        this.sharedTimes = sharedTimes;
    }
}
