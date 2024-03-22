package com.app.retry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.retry.entity.FailedMessage;

@Repository
public interface FailedMessageRepository extends JpaRepository<FailedMessage, Long> {
}

