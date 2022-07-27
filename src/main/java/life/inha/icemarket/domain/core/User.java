package life.inha.icemarket.domain.core;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    @NonNull
    @Column(name = "password_hashed")
    private String passwordHashed;

    private String nickname;

    @CreatedDate
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;

    @Column(name = "deleted_at")
    private Instant deletedAt;
}
