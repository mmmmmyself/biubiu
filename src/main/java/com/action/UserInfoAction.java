package com.action;

import com.entity.Users;
import com.opensymphony.xwork2.ModelDriven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserInfoAction extends JsonActionSupport implements ModelDriven<Users>, ServiceSupport {

    Users user_info = new Users();


    @Override
    public Users getModel() {
        return user_info;
    }
}
