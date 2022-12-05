package zmall.domain;

import zmall.domain.*;
import zmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookingCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String price;
    private String quantity;
    private String status;
}


