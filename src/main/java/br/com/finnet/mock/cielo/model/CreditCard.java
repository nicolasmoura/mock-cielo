package br.com.finnet.mock.cielo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

@Data
@JsonRootName("CreditCard")
public class CreditCard {

    @JsonProperty("CardNumber")
    private String cardNumber;
    @JsonProperty("Holder")
    private String holder;
    @JsonProperty("ExpirationDate")
    private String expirationDate;
    @JsonProperty("SecurityCode")
    private String securityCode;
    @JsonProperty("CardToken")
    private String cardToken;
    @JsonProperty("SaveCard")
    private Boolean saveCard;
    @JsonProperty("Brand")
    private String brand;
}
