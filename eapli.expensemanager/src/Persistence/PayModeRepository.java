
package Persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.PayMode;
import Model.PaymentType;

/**
 *
 * @author Castro
 */
public class PayModeRepository implements IPayModeRepository{
    private static PayModeRepository instance = null;
	
	private List<PayMode> list;

	public static synchronized PayModeRepository getInstance() {
		
		if (instance == null)
			instance = new PayModeRepository();
		
                
		return instance;
	}
	
	private PayModeRepository(){
		list = new ArrayList<PayMode>();
                list.add(new PayMode(new PaymentType("Cash"),new HashMap<String,Object>()));
	}

	public void save(PayMode paymode) {
		list.add(paymode);
	}
      
        public List getPayMode() {
                return list;
        }
}
