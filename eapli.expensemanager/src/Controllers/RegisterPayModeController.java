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
import Persistence.IPayModeRepository;
import Persistence.IPaymentTypeRepository;
import Persistence.PersistenceFactory;
import Persistence.RepositoryFactory;
import Presentation.PayModeUI;
import java.util.Collection;

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
      
        RepositoryFactory repFac = PersistenceFactory.buildPersistenceFactory();
        
        IPaymentTypeRepository paymentTypeRep = repFac.buildPaymentTypeRepository();
        
          //Retorna os Tipos de Pagamento para uma lista;
        Collection<PaymentType> typeList = paymentTypeRep.findAll();
        
        //Extrai a string name de todos os tipo de pagamento
        LinkedList<String> types = new LinkedList<String>();
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
        IPayModeRepository payModeRep = repFac.buildPayModeRepository();
        payModeRep.save(payMode);
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