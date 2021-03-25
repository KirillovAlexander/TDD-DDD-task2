package ru.netology.domain.animal.repository;

import ru.netology.domain.animal.entity.Animal;

public interface AnimalRepository {
    Animal getById(String id);

    String add(Animal animal);

    Animal remove(String id);

    Animal update(Animal animal);
}
