package com.klouddy.example.service;

import com.klouddy.example.db.NotifyUserRepository;
import com.klouddy.example.models.NotifyUser;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
  private final NotifyUserRepository userRepository;

  public UserService(NotifyUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  /**
   * get all users from repository.
   * Typically, this would require a page so it doesn't die when there
   * are too many users.
   */
  public List<NotifyUser> getUsers() {
    return new ArrayList<>(this.userRepository.findAll());
  }
}
