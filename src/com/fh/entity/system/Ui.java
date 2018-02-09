package com.fh.entity.system;


/** 
 * 说明：UI模块 实体类
 * 创建人：Java Admin
 * 创建时间：2018-02-06
 */
public class Ui{
    private Integer UI_ID;//主键id
    private String UI_NAME;//菜单名称
    private String UI_URL;//地址(父菜单是为#)
    private String PARENT_ID;//父级id
    private Integer UI_ORDER;//排序序号
    private String UI_ICON;//菜单图标
    private String UI_TYPE;//UI类型(1:CMS,2:商城3.OA)
    private Integer UI_STATE;//菜单状态(0:隐藏 1:显示)
      
    public void setUI_ID(Integer UI_ID){
        this.UI_ID = UI_ID;
    }
      
    public Integer getUI_ID(){
        return this.UI_ID;
    }
      
    public void setUI_NAME(String UI_NAME){
        this.UI_NAME = UI_NAME;
    }
      
    public String getUI_NAME(){
        return this.UI_NAME;
    }
      
    public void setUI_URL(String UI_URL){
        this.UI_URL = UI_URL;
    }
      
    public String getUI_URL(){
        return this.UI_URL;
    }
      
    public void setPARENT_ID(String PARENT_ID){
        this.PARENT_ID = PARENT_ID;
    }
      
    public String getPARENT_ID(){
        return this.PARENT_ID;
    }
      
    public void setUI_ORDER(Integer UI_ORDER){
        this.UI_ORDER = UI_ORDER;
    }
      
    public Integer getUI_ORDER(){
        return this.UI_ORDER;
    }
      
    public void setUI_ICON(String UI_ICON){
        this.UI_ICON = UI_ICON;
    }
      
    public String getUI_ICON(){
        return this.UI_ICON;
    }
      
    public void setUI_TYPE(String UI_TYPE){
        this.UI_TYPE = UI_TYPE;
    }
      
    public String getUI_TYPE(){
        return this.UI_TYPE;
    }
      
    public void setUI_STATE(Integer UI_STATE){
        this.UI_STATE = UI_STATE;
    }
      
    public Integer getUI_STATE(){
        return this.UI_STATE;
    }
      
}
