package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Fund {
    private String payersAccountNo;
    private String PayeesAccountNo;
    private String amount;
    private String description;
}
