package com.sip.ams.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sip.ams.entities.Usersss;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<Usersss, Integer> {
    Usersss findByEmail(String email);
}

