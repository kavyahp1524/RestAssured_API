package POJOMethod;

import java.util.ArrayList;
import java.util.List;

public class JsonPojo {

	
	private List<AccoutingPojoClass> accounting = new ArrayList<AccoutingPojoClass>();
    private List<SalesPojoClass> sales = new ArrayList<SalesPojoClass>();
   
    public List<AccoutingPojoClass> getAccounting() 
    {
        return accounting;
    }
    public void setAccounting(List<AccoutingPojoClass> accounting) 
    {
        this.accounting = accounting;
    }
    public List<SalesPojoClass> getSales() 
    {
        return sales;
    }
    public void setSales(List<SalesPojoClass> sales) 
    {
        this.sales = sales;
    }

}
