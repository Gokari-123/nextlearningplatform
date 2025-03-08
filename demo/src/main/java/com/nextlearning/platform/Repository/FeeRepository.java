package com.nextlearning.platform.Repository;

import com.nextlearning.platform.Entity.Fee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeeRepository extends JpaRepository<Fee, Long> {
}
