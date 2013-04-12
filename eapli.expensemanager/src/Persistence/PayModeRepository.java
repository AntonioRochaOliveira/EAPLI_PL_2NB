
package Persistence;

import Model.PayMode;
import Model.PaymentType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Castro
 */
public class PayModeRepository implements IPaymentRepository{
    private static PayModeRepository instance = null;
	
	private List<PayMode> list;

	public static synchronized PayModeRepository getInstance() {
		
		if (instance == null)
			instance = new PayModeRepository();
		
		return instance;
	}
	
	private PayModeRepository(){
		list = new ArrayList<PayMode>();
                //For testing Purposes
                list.add(new PayMode(new PaymentType("Cash"),new HashMap<String,Object>()));
	}

	      @Override
    public List getAll() {
          return list;
          }

    @Override
    public void save(Object obj) {
        if (obj instanceof PayMode)
        list.add((PayMode)obj);
        else
              throw new IllegalArgumentException();
    }
}
