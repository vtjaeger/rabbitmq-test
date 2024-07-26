package br.com.vtjaeger.demo_rabbitmq.consumer;

import br.com.vtjaeger.demo_rabbitmq.facade.PagamentoFacade;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class PagamentoResponseSucessoConsumer {
    @Autowired private PagamentoFacade pagamentoFacade;

    @RabbitListener(queues = {"pagamento-response-sucesso-queue"})
    public void receive(@Payload Message message) {
        String payload = String.valueOf(message.getPayload());
        pagamentoFacade.sucessoPagamento(payload);
    }
}