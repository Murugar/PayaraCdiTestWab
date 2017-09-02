
package com.iqmsoft.cdi.test;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@SessionScoped
public class IndexController implements Serializable{

    private static final long serialVersionUID = 1981249450119487649L;

    public String getGreetings() {
        return "Hello User";
    }
}
