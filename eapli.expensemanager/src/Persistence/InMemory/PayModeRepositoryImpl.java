package Persistence.InMemory;

import Model.PayMode;
import Persistence.IPayModeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Castro
 */
public class PayModeRepositoryImpl implements IPayModeRepository {

    private static PayModeRepositoryImpl instance = null;
    private List<PayMode> list;

    public static synchronized PayModeRepositoryImpl getInstance() {

        if (instance == null) {
            instance = new PayModeRepositoryImpl();
        }
        return instance;
    }

    private PayModeRepositoryImpl() {
        list = new ArrayList<PayMode>();
     }

    public PayMode save(PayMode paymode) {
        list.add(paymode);
        return paymode;
    }

    @Override
    public void delete(PayMode payMode) {
        list.remove(payMode);
    }

    @Override
    public long size() {
        return list.size();
    }

    @Override
    public List<PayMode> findAll() {
        return list;
    }
}