package com.klouddy.example.controllers;


import com.klouddy.example.db.NotifyUserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRestRepository extends PagingAndSortingRepository<NotifyUserEntity, Long> {
}
