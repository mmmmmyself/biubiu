package com.action;

import com.entity.Videos;
import com.entity.modelBeans.PageModel;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

public class SosoAction extends ActionSupport implements ModelDriven<PageModel<Videos>>, ServiceSupport {
    public PageModel<Videos> pageModel = new PageModel<>();


    @Override
    public PageModel<Videos> getModel() {
        return pageModel;
    }


    @Override
    public String execute() throws Exception {

        return SUCCESS;
    }
}
