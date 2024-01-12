package com.oracle.oraclesampleservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Accessors(chain = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SampleServiceRq {
    @JsonProperty("service_id")
    private String serviceId;
    @JsonProperty("order_type")
    private String orderType;
    @JsonProperty("type")
    private String type;
    @JsonProperty("trx_id")
    private String trxId;
}
