package com.klouddy.example.controllers;

import com.klouddy.example.db.SubscriptionEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "subsription", path = "subscriptions")
public interface SubscriptionRestRepository extends PagingAndSortingRepository<SubscriptionEntity, Integer> {
}
