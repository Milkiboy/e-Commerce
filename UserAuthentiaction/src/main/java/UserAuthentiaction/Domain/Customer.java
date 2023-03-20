package UserAuthentiaction.Domain;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    private long customerNumber;
    private String name;
    private Contact contact;
    private Address address;
}
