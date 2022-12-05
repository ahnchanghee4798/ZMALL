package zmall.domain;

import zmall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Picked extends AbstractEvent {

    private Long id;
    private Boolean isPicked;
    private Long orderId;
    private Boolean isDelivered;
    private Date pickedTime;
}
