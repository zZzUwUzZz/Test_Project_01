package dto;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.tool.schema.spi.SchemaTruncator;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    public int idx;
    public String name;
    public String birthday;
    public String phone;
    public String address;
    public String account;
    public String password;
    public String regdate;
}
