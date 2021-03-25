package ru.netology.domain.clinic.drug.repository;

import ru.netology.domain.clinic.drug.valueObject.Drug;

public interface DrugRepository {
    Drug getById(String id);

    String add(Drug drug);

    Drug remove(String id);

    Drug update(Drug drug);
}
