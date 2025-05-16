package com.medical.appointments;

import com.medical.appointments.model.Doctor;
import com.medical.appointments.model.Patient;
import com.medical.appointments.ui.UIMenu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        UIMenu.showMenu();

        Doctor myDoctor = new Doctor("Elias Rojas", "eliasr@doctor.com");
        myDoctor.addAvailableAppoinment(new Date(), "4pm");
        myDoctor.addAvailableAppoinment(new Date(), "10am");
        myDoctor.addAvailableAppoinment(new Date(), "1pm");

        System.out.println(myDoctor);

//        for(Doctor.AvailableAppintment aA : myDoctor.getAvailableAppintments()){
//            System.out.println(aA.getDate() + " " + aA.getTime());
//        }

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        patient.setWeight(75.0);
        System.out.println(patient);
//
//        patient.setPhoneNumber("5519121718");
//        System.out.println(patient.getPhoneNumber());



    }
}