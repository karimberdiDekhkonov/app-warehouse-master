package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Input;
import uz.pdp.appwarehouse.entity.InputProduct;
import uz.pdp.appwarehouse.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductController {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
