package br.com.vtjaeger.demo_rabbitmq_worker.consumer;

import br.com.vtjaeger.demo_rabbitmq_worker.producer.PagamentoErroProducer;
import br.com.vtjaeger.demo_rabbitmq_worker.producer.PagamentoSucessoProducer;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PagamentoRequestConsumer {
    @Autowired private PagamentoErroProducer erroProdutor;
    @Autowired private PagamentoSucessoProducer sucessoProdutor;

    @RabbitListener(queues = { "pagamento-request-queue"})
    public void receberMensagem (@Payload Message message) {
        System.out.println(message);
        if (new Random().nextBoolean()) {
            sucessoProdutor.gerarResposta("Mensagem de sucesso Pagamento " + message);
        } else {
            erroProdutor.gerarResposta("ERRO no pagamento " + message);
        }
    }
}