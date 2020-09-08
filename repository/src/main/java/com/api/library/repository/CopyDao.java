package com.api.library.repository;

import com.api.library.model.Copy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CopyDao extends JpaRepository<Copy, Long> {
}
