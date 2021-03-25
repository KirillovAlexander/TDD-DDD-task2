package ru.netology.domain.clinic.appointment.repository;

import ru.netology.domain.clinic.appointment.entity.Appointment;

public interface AppointmentRepository {

    Appointment getById(String id);

    String add(Appointment patientInfo);

    Appointment update(Appointment patientInfo);
}
