package com.medical.appointments.model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    //Atributos
    private String speciality;


    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del Doctor asignado es: " + name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppintment> availableAppintments = new ArrayList<>();

    public void addAvailableAppoinment(Date date, String time){
        availableAppintments.add(new Doctor.AvailableAppintment(date, time));
    }

    public  ArrayList<AvailableAppintment> getAvailableAppintments(){
        return availableAppintments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecialty: " + speciality + "\nAvaialable: " + availableAppintments.toString();
    }

    public static class AvailableAppintment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppintment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointment \nDate: " + date + "\nTime: " + time;
        }
    }

}
