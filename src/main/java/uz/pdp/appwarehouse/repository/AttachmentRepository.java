package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.projection.AttachmentController;

@RepositoryRestResource(path = "attachment",excerptProjection = AttachmentController.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
