package guru.springframework.sfgpetclinic.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    private String firstName;
    private String lastName;
}