package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String orderStatus;
    private String orderedTime;
    private String foodName;
}


