package zmall.domain;

import zmall.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Ordered extends AbstractEvent {

    private Long id;
    private String orderStatus;
    private String orderedTime;
    private String foodName;
    private String customerId;
}
