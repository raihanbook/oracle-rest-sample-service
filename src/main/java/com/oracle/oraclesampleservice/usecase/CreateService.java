package com.oracle.oraclesampleservice.usecase;

import com.oracle.oraclesampleservice.model.RequestPayload;
import com.oracle.oraclesampleservice.model.ResponsePayload;
import com.oracle.oraclesampleservice.model.SampleServiceRs;
import org.springframework.stereotype.Component;

@Component
public class CreateService {

    public ResponsePayload returnResponsePayload (RequestPayload requestPayload) {
        ResponsePayload responsePayload = new ResponsePayload();
        SampleServiceRs sampleServiceRs = new SampleServiceRs();

        String trxId = requestPayload.getSampleServiceRq().getTrxId();

        if (trxId == null) {
            sampleServiceRs.setErrorCode("400");
            sampleServiceRs.setErrorMsg("Bad Request - trx_id is null");
        } else {
            sampleServiceRs.setErrorCode("0000");
            sampleServiceRs.setErrorMsg("Succes");
            sampleServiceRs.setTrxId(trxId);
        }

        responsePayload.setSampleServiceRs(sampleServiceRs);

        return responsePayload;
    }
}
