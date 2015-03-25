package entities;

import javafx.scene.image.Image;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Johannes on 24.03.15.
 */
public class Patient {

    public static enum Gender {male, female, undefined}
    public static enum BloodGroup {Apositive, Bpositive, AB, ZeroNegative, ZeroPositive}

    private int pid = -1;
    private UUID beaconID = null;
    private String firstname;
    private String lastname;
    private Date birthDate;
    private boolean reaState;
    private int fid = -1;
    private String StationName;
    private String room;
    private Gender gender;
    private BloodGroup bloodGroup;
    public Image genderImage;

    public Patient(int pid, UUID beaconID, String firstname, String lastname, Date birthDate, boolean reaState, int fid, String stationName, String room, Gender gender, BloodGroup bloodGroup) {
        this.pid = pid;
        this.beaconID = beaconID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.reaState = reaState;
        this.fid = fid;
        this.room = room;
        this.gender = gender;
        this.StationName = stationName;
        this.bloodGroup = bloodGroup;

        if (this.gender == Gender.female) {
            this.genderImage = new Image("resources/image/woman139.png");
        } else if(this.gender == Gender.male) {
            this.genderImage = new Image("resources/image/user194.png");
        } else {
            this.genderImage = null;
        }
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public UUID getBeaconID() {
        return beaconID;
    }

    public void setBeaconID(UUID beaconID) {
        this.beaconID = beaconID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isReaState() {
        return reaState;
    }

    public void setReaState(boolean reaState) {
        this.reaState = reaState;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }


    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Image getGenderImage() {
        return genderImage;
    }


}
