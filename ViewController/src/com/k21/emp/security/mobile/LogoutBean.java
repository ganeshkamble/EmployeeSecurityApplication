package com.k21.emp.security.mobile;

import oracle.adfmf.amx.event.ActionEvent;
import oracle.adfmf.framework.api.AdfmfJavaUtilities;

public class LogoutBean {
    public LogoutBean() {
    }

    public void logout(ActionEvent actionEvent) {
        AdfmfJavaUtilities.logout();
    }
}
