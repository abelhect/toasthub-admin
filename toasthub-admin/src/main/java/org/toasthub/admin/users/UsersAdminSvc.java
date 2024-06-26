package org.toasthub.admin.users;

import org.toasthub.core.general.model.RestRequest;
import org.toasthub.core.general.model.RestResponse;
import org.toasthub.security.users.UsersSvc;

public interface UsersAdminSvc extends UsersSvc {

	public void disable(RestRequest request, RestResponse response);
	public void delete(RestRequest request, RestResponse response);
	public void save(RestRequest request, RestResponse response);
	void saveRole(RestRequest request, RestResponse response);
	void deleteRole(RestRequest request, RestResponse response);
}
