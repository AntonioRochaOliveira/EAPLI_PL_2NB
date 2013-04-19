/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import Model.PaymentType;
import Model.PayMode;
import Persistence.PayModeRepository;
import Persistence.PaymentTypeRepository;
import Presentation.PayModeUI;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author xiko
 */
public class RegisterPayModeController extends BaseController {

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
        //Vai buscar 
        Map<String, Object> aditionalInformation = new HashMap<String,Object>();
        for (String s : paymentType.getAditionalInformationNames().keySet()) {
            aditionalInformation.put(s, ui.getAditionalInformation(s,paymentType.getAditionalInformationNames().get(s)));
        }
        PayModeRepository.getInstance().save(new PayMode(paymentType,aditionalInformation));
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
       return new CheckingAccount();
    }

}