package mg.odg.gen.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mg.odg.gen.auth.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
