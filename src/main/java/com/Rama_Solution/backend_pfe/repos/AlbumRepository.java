package com.Rama_Solution.backend_pfe.repos;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Rama_Solution.backend_pfe.entities.Album;


public interface AlbumRepository extends JpaRepository<Album, Long> {
	Optional<Album> findByName(String name);
}
