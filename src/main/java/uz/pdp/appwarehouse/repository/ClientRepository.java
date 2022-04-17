package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Client;
import uz.pdp.appwarehouse.projection.ClientController;

@RepositoryRestResource(path = "client",excerptProjection = ClientController.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
    boolean existsByNameAndPhoneNumber(String name,String phoneNumber);
}
