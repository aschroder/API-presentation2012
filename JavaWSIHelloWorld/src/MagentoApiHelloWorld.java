import java.util.List;

import magento.CustomerGroupEntity;
import magento.CustomerGroupListRequestParam;
import magento.CustomerGroupListResponseParam;
import magento.LoginParam;
import magento.LoginResponseParam;
import magento.MageApiModelServerWsiHandlerPortType;
import magento.MagentoService;


public class MagentoApiHelloWorld {

	
	public static void main(String[] args) {
		
		MagentoService service = new MagentoService();
		MageApiModelServerWsiHandlerPortType port = service.getMageApiModelServerWsiHandlerPort();
		port.startSession();
		LoginParam parameters = new LoginParam();
		parameters.setUsername("TEST_USER");
		parameters.setApiKey("TEST_PASSWORD");
		LoginResponseParam loginResponse = port.login(parameters);
		
		CustomerGroupListRequestParam request = new CustomerGroupListRequestParam();
		request.setSessionId(loginResponse.getResult());
		CustomerGroupListResponseParam customerGroupList = port.customerGroupList(request);
		
		List<CustomerGroupEntity> arrayOfCustomerGroups = 
				customerGroupList.getResult().getComplexObjectArray();
		for (CustomerGroupEntity customerGroupEntity : arrayOfCustomerGroups) {
			System.out.println(customerGroupEntity.getCustomerGroupCode());
		}
		
	}
}
