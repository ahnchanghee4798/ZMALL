package zmall.domain;

import zmall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Approved extends AbstractEvent {

    private Long id;
    private String orderId;
    private String price;
    private String quantity;
    private String status;
}
