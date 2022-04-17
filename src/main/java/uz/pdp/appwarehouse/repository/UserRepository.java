package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.User;
import uz.pdp.appwarehouse.projection.UserController;

@RepositoryRestResource(path = "user",excerptProjection = UserController.class)
public interface UserRepository extends JpaRepository<User,Integer> {

}
