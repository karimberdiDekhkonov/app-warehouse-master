package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Client;
import uz.pdp.appwarehouse.entity.Currency;
import uz.pdp.appwarehouse.entity.Output;
import uz.pdp.appwarehouse.entity.Warehouse;

import java.util.Date;

@Projection(types = Output.class)
public interface OutputController {
    Integer getId();

    Date getDate();

    Warehouse getWarehouse();

    Client getClient();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
