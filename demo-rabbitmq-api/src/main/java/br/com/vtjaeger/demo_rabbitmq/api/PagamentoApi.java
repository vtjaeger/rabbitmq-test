package br.com.vtjaeger.demo_rabbitmq.api;

import br.com.vtjaeger.demo_rabbitmq.dto.PagamentoDto;
import br.com.vtjaeger.demo_rabbitmq.facade.PagamentoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pagamentos")
public class PagamentoApi {
    @Autowired private PagamentoFacade pagamentoFacade;

    @PostMapping
    public String processar (@RequestBody PagamentoDto request) {
        return pagamentoFacade.solicitarPagamento(request);
    }

}
