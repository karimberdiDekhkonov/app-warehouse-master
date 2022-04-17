package uz.pdp.appwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appwarehouse.entity.Category;
import uz.pdp.appwarehouse.projection.CategoryController;

@RepositoryRestResource(path = "category",excerptProjection = CategoryController.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
