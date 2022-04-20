package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Customized {
    private String accountNo;
    private String fromDate;
    private String toDate;
    private String minimumTransactionValue;
    private String numberOfTransaction;
}
