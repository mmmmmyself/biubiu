package com.action;


import com.entity.Users;
import com.opensymphony.xwork2.ModelDriven;

import org.apache.struts2.ServletActionContext;

public class LoginAction extends JsonActionSupport implements ModelDriven<Users> ,ServiceSupport {

    public Users user = new Users();//表单模型

  
    @Override
    public Users getModel() {
        return user;
    }
}
