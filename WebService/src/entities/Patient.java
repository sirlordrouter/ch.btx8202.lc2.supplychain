package entities;

import javafx.scene.image.Image;

import java.time.LocalDate;
import java.time.Period;

/**
 * Bern University of Applied Sciences<br>
 * BSc Medical Informatics<br>
 * Module <br>
 *
 *<p>
 * Describes a Patient Object with necessary information to display in MediPrep.
 *</p>
 *
 * @author Johannes Gnaegi, johannes.gnaegi@students.bfh.ch
 * @version 26.03.2015
 */
public class Patient {

    public static enum Gender {male, female, undefined}
    public static enum BloodGroup {Apositive, Bpositive, AB, ZeroNegative, ZeroPositive}

    private int pid = -1;
    private String beaconID = null;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private boolean reaState = false;
    private int fid = -1;
    private String StationName;
    private String room;
    private Gender gender;
    private BloodGroup bloodGroup;
    public Image genderImage;

    public Patient() {}

    public Patient(int pid, String beaconID, String firstname, String lastname, LocalDate birthDate, boolean reaState, int fid, String stationName, String room, Gender gender, BloodGroup bloodGroup) {
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

    public String getBeaconID() {
        return beaconID;
    }

    public void setBeaconID(String beaconID) {
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = this.getBirthDate();
        Period p = Period.between(birthday, today);
        return p.getYears();
    }

    public void setBirthDate(LocalDate birthDate) {
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
