package com.sprint.mission.discodeit.repository;

import com.sprint.mission.discodeit.entity.UserStatus;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserStatusRepository {
    void save(UserStatus userStatus);
    Optional<UserStatus> findById(UUID userStatusUUID);
    Optional<UserStatus> findByUserId(UUID userUUID);
    List<UserStatus> findAll();
    void delete(UUID userStatusUUID);
}
