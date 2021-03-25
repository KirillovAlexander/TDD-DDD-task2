package ru.netology.domain.clinic.appointment.entity;

import ru.netology.domain.animal.entity.Animal;
import ru.netology.domain.clinic.doctor.entity.Doctor;
import ru.netology.domain.clinic.drug.valueObject.Drug;

import java.util.Date;
import java.util.Set;

public class Appointment {
    private String id;
    protected Date date;
    protected Animal animal;
    protected String description;
    protected Doctor doctor;
    protected AppointmentStatus status;
    protected Set<Drug> drugList;

    public Appointment(String id, Date date, Animal animal, String description, Doctor doctor, AppointmentStatus status) {
        this.id = id;
        this.date = date;
        this.animal = animal;
        this.description = description;
        this.doctor = doctor;
        this.status = status;
    }

    public void addDrug(Drug drug) {
        drugList.add(drug);
    }

    public Animal getAnimal() {
        return animal;
    }
}
