
package com.project.model;

import java.util.List;
import javax.annotation.Generated;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
@Component
public class Case {

    @SerializedName("@id")
    @Expose
    private String id;
    @SerializedName("CBSLpayoutPerCaseInstance")
    @Expose
    private List<CBSLpayoutPerCaseInstance> cBSLpayoutPerCaseInstance = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<CBSLpayoutPerCaseInstance> getCBSLpayoutPerCaseInstance() {
        return cBSLpayoutPerCaseInstance;
    }

    public void setCBSLpayoutPerCaseInstance(List<CBSLpayoutPerCaseInstance> cBSLpayoutPerCaseInstance) {
        this.cBSLpayoutPerCaseInstance = cBSLpayoutPerCaseInstance;
    }

}
