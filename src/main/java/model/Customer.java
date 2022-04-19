package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String city;
    private String state;
    private String PIN;
    private String mobileNumber;
    private String email;
    private String password;
}
