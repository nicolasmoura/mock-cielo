package br.com.finnet.mock.cielo.controller;

import br.com.finnet.mock.cielo.model.PaymentRequest;
import br.com.finnet.mock.cielo.model.PaymentResponse;
import br.com.finnet.mock.cielo.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class PagamentoController {

    @Autowired
    public PagamentoService pagamentoService;

    @RequestMapping(value = "/1/sales/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    PaymentResponse solicitarPagamento(@RequestBody PaymentRequest paymentRequest) throws Exception {
        return pagamentoService.solicitarPagamento(paymentRequest);
    }
}
