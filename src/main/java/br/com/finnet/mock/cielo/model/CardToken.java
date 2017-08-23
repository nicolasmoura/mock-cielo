package br.com.finnet.mock.cielo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CardToken {

    @JsonProperty("CardToken")
    private String cardToken;
}
