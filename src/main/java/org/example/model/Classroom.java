package org.example.model;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "classroom")
@XmlAccessorType(XmlAccessType.FIELD)
public class Classroom {

    @XmlAttribute(name = "classroom_id")
    private int classroomID;

    @XmlElement(name = "classroom_number")
    private String classroomNumber;

    @XmlElement(name = "capacity")
    private int capacity;

    public Classroom() {
    }

    public Classroom(int classroomID, String classroomNumber, int capacity) {
        this.classroomID = classroomID;
        this.classroomNumber = classroomNumber;
        this.capacity = capacity;
    }

    public int getClassroomID() {
        return classroomID;
    }

    public void setClassroomID(int classroomID) {
        this.classroomID = classroomID;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
