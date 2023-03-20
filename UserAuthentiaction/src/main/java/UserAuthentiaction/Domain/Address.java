package UserAuthentiaction.Domain;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String street;
    private String city;
    private int zip;

}