/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import Model.CheckingAccount;
import Model.PayMode;
import Model.PaymentType;
import Persistence.PayModeRepository;
import Persistence.PaymentTypeRepository;
import Presentation.PayModeUI;

/**
 *
 * @author xiko
 */
public class RegisterPayModeController extends BaseController {

    private PayMode payMode;
    
    public RegisterPayModeController() {
    this(new PayModeUI());
    }
    
    public RegisterPayModeController(PayModeUI ui) {
        //Retorna os Tipos de Pagamento para uma lista;
        List<PaymentType> typeList = PaymentTypeRepository.getInstance().getPaymentType();

        //Extrai a string name de todos os tipo de pagamento
        LinkedList<String> types = new LinkedList();
        for (PaymentType s : typeList) {
            types.add(s.getName());
        }
        //Envia essas strings para a UI para que o utilizador escolha uma
        String type = ui.getPaymentType(types);
        PaymentType paymentType = null;

        //Escolhe o objecto que a string escolhida pertence
        for (PaymentType s : typeList) {
            if (type.equals(s.getName())) {
                paymentType = s;
            }
        }
        //Vai buscar todas as variaveis a preencher pelo utilizador do paymentType
        Map<String, Object> aditionalInformation = new HashMap<String, Object>();
        for (String s : paymentType.getAditionalInformationNames().keySet()) {
            //Envia para a UI o nome e tipo da Variavel e retorna um objecto com esse tipo
            aditionalInformation.put(s, ui.getAditionalInformation(s, paymentType.getAditionalInformationNames().get(s)));
        }
        payMode = new PayMode(paymentType, aditionalInformation);
        //Guarda no Repositorio
        PayModeRepository.getInstance().save(payMode);
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }

    /**
     * @return the payMode
     */
    public PayMode getPayMode() {
        return payMode;
    }

}