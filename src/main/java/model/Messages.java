package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity

public class Messages {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long conversationId;

        private LocalDateTime timestamp;

        private Long from;

        private Long to;

        private String text;
}
