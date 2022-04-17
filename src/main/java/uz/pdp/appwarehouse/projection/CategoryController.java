package uz.pdp.appwarehouse.projection;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.web.bind.annotation.*;
import uz.pdp.appwarehouse.entity.Category;

@Projection(types = Category.class)
public interface CategoryController {
    Integer getId();

    String getName();

    Boolean getActive();

    Category getCategory();
}
