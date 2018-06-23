package com.action;

import com.entity.Users;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction extends JsonActionSupport implements ModelDriven<Users>,
        ServiceSupport {

    public Users user = new Users();//表单模型

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public Users getModel() {
        return user;
    }
}
