package ru.netology.domain.service.medical;

import ru.netology.domain.clinic.appointment.entity.Appointment;
import ru.netology.domain.clinic.drug.valueObject.Drug;
import ru.netology.domain.service.notification.ConsoleNotification;
import ru.netology.domain.service.notification.Notification;

public class MedicalService {
    public void prescribeDrug(Appointment appointment, Drug drug) {
        if (!appointment.getAnimal().hasContradiction(drug)) {
            appointment.addDrug(drug);
        } else {
            Notification notification = ConsoleNotification.getInstance();
            notification.notifyUser("Имеются противопоказания к данному лекарству!");
        }
    }
}
