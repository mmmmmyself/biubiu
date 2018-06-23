package com.action;

import com.entity.Users;
import com.utils.CreateId;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiveAction extends ActionSupport implements ServiceSupport {
   
    @Override
    public String execute() throws Exception {

            return SUCCESS;
    }

}
