package UserAuthentiaction.Domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentMethod {

    private String name;

    private String type;

    private String cardNumber;

    private String expiryDate;

}
