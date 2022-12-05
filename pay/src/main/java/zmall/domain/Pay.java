package zmall.domain;

import zmall.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Pay_table")
@Data

public class Pay  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String price;
    
    
    
    
    
    private String quantity;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String customerId;

    @PostPersist
    public void onPostPersist(){
    }

    public static PayRepository repository(){
        PayRepository payRepository = PayApplication.applicationContext.getBean(PayRepository.class);
        return payRepository;
    }



    public void pay(){
        OrderPaid orderPaid = new OrderPaid(this);
        orderPaid.publishAfterCommit();

    }

    public static void refund(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }
    public static void addPaymentList(Ordered ordered){

        /** Example 1:  new item 
        Pay pay = new Pay();
        repository().save(pay);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(pay->{
            
            pay // do something
            repository().save(pay);


         });
        */

        
    }


}
