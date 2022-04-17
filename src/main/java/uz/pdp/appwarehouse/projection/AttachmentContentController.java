package uz.pdp.appwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appwarehouse.entity.Attachment;
import uz.pdp.appwarehouse.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentController {
    Integer getId();

    Byte[] getBytes();

    Attachment getAttachment();
}
