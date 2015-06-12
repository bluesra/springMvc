package com.jss.ishare.db;

import com.jss.ishare.domain.Spitter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Jack Yang on 6/12/2015.
 */
public interface SpitterRepository extends JpaRepository<Spitter, Long>, SpitterSweeper {
    Spitter findByUsername(String username);

    List<Spitter> findByUsernameOrFullNameLike(String username, String fullName);
}
