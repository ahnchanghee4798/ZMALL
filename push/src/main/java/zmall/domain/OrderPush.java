package zmall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="OrderPush_table")
@Data
public class OrderPush {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String storeStatus;
        private Boolean isPicked;
        private Boolean isDelivered;


}
