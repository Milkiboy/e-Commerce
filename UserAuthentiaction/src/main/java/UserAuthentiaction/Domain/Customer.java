package UserAuthentiaction.Domain;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private List<Address> addresses = new ArrayList<>();

    private List<PaymentMethod> paymentMethods = new ArrayList<>();

}
