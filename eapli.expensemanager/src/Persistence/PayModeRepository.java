
package Persistence;

import Model.PayMode;
import java.util.ArrayList;
import java.util.List;

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
	}

	public void save(PayMode paymode) {
		list.add(paymode);
	}
      
        public List getPayMode() {
                return list;
        }
}
