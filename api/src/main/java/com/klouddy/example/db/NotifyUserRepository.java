package com.klouddy.example.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotifyUserRepository extends JpaRepository<NotifyUserEntity, String> {

}
