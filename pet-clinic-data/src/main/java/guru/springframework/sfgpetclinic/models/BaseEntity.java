package guru.springframework.sfgpetclinic.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BaseEntity implements Serializable {
    private Long id;
}
