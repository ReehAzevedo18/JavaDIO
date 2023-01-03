package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        //Atraves da classe CepApi a gente consegue pegar as demais informações que não estáo visiveis na camada CRM Service
        String cidade = CepApi.cepApi().recuperarCidade(cep);
        String estado = CepApi.cepApi().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
