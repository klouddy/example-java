package com.klouddy.example.controllers;

import com.klouddy.example.db.SubjectEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "subject", path = "subjects")
public interface SubjectRestRepository extends PagingAndSortingRepository<SubjectEntity, String> {
}
