package UserAuthentiaction.Domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Contact {
    private String phone;
    private String email;
}
