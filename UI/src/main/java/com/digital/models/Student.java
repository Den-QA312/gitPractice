package com.digital.models;
import lombok.*;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Builder // можно создавать конструкторы с рзличными параметрами
//@ToString
//@EqualsAndHashCode
@Data
public class Student {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String currentAddress;
    private String age;
    private String password;
    private String salary;

}
