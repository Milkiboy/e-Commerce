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

    private String state;

    private String country;

    private String zipCode;



}