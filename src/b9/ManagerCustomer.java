package b9;

import java.util.ArrayList;
import java.util.List;

public class ManagerCustomer {
    private final List<Customer> customerList;

    public ManagerCustomer() {
        this.customerList = new ArrayList<>();
    }

    public void add(Customer customer){
        this.customerList.add(customer);
    }

    public Customer check(String id){
        for (Customer item : customerList) {
            if (item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }

//    public Customer update(String id, Customer customer){
//        for (Customer item : customerList) {
//            if(item.getId().equals(id)){
//                item.setId(id);
//            }
//        }
//    }

    public boolean deleteById(String id){
        if (check(id) == null){
            return false;
        }
        customerList.remove(check(id));
        return true;
    }


}
