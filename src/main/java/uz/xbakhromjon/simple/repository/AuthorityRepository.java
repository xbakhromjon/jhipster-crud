package uz.xbakhromjon.simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.xbakhromjon.simple.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
