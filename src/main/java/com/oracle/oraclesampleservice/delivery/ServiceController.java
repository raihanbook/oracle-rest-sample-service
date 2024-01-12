package com.oracle.oraclesampleservice.delivery;

import com.oracle.oraclesampleservice.model.RequestPayload;
import com.oracle.oraclesampleservice.model.ResponsePayload;
import com.oracle.oraclesampleservice.usecase.CreateService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController()
@RequestMapping("/external/services/rest")
public class ServiceController {
    @Autowired
    private CreateService createService;

    @RequestMapping(
            value = "/sample-service",
            headers = { "Content-Type=application/json", "Accept=application/json" },
            method = POST)
    public ResponseEntity<?> CreateService(
            @RequestBody RequestPayload requestPayload) {
        ResponsePayload responsePayload = createService.returnResponsePayload(requestPayload);
        return ResponseEntity.status(HttpStatus.OK).body(responsePayload);
    }
}
