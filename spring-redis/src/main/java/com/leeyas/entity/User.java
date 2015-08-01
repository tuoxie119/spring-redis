package com.leeyas.entity;

import java.io.Serializable;

public class User implements Serializable {  
    
    private static final long serialVersionUID = -6011241820070393952L;  
  
    private String id;  
      
    private String name;  
      
    private String password;  
  
    /** 
     * <br>------------------------------<br> 
     */  
    public User() {  
          
    }  
      
    /** 
     * <br>------------------------------<br> 
     */  
    public User(String id, String name, String password) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.password = password;  
    }  
  
    /** 
     * ���id 
     * @return the id 
     */  
    public String getId() {  
        return id;  
    }  
  
    /** 
     * ����id 
     * @param id the id to set 
     */  
    public void setId(String id) {  
        this.id = id;  
    }  
  
    /** 
     * ���name 
     * @return the name 
     */  
    public String getName() {  
        return name;  
    }  
  
    /** 
     * ����name 
     * @param name the name to set 
     */  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    /** 
     * ���password 
     * @return the password 
     */  
    public String getPassword() {  
        return password;  
    }  
  
    /** 
     * ����password 
     * @param password the password to set 
     */  
    public void setPassword(String password) {  
        this.password = password;  
    }  
}  