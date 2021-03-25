package ru.netology.domain.clinic.doctor.repository;

import ru.netology.domain.clinic.doctor.entity.Doctor;

public interface DoctorRepository {
    Doctor getById(String id);

    String add(Doctor doctor);

    Doctor remove(String id);

    Doctor update(Doctor doctor);
}
