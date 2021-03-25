package ru.netology.domain.client.repository;

import ru.netology.domain.client.entity.Client;

public interface ClientRepository {
    Client getById(String id);

    String add(Client client);

    Client remove(String id);

    Client update(Client client);
}
