package ru.netology.domain.animal.entity;

import ru.netology.domain.client.entity.Client;
import ru.netology.domain.clinic.drug.valueObject.Drug;

import java.util.Date;
import java.util.Set;

public class Animal {
    private String id;
    private String name;
    private Date birthday;
    private KindOfAnimal kind;
    private Client owner;
    private Set<Drug> contraindications;

    public Animal(String id, String name, Date birthday, KindOfAnimal kind, Client owner) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.kind = kind;
        this.owner = owner;
    }

    public boolean hasContradiction(Drug drug) {
        return contraindications.contains(drug);
    }
}
