package site.dmarket.dmarketbackend.domain.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class User {

    @PrePersist
    public void prePersist() {
        this.manner = this.manner == null ? 36.5 : this.manner;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(length = 11, nullable = false, unique = true)
    private String phoneNumber;

    @Column(length = 60, nullable = false)
    private String email;

    @Column(length = 60, nullable = false)
    private String region;

    @Column(length = 10, nullable = false)
    private Double manner;

    @Column(nullable = true)
    private String profileImg;

    @CreatedDate
    private LocalDateTime createDate;

    @LastModifiedDate
    private LocalDateTime updateDate;
}
