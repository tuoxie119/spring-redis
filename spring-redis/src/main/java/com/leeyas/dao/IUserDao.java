package com.leeyas.dao;

import java.util.List;

import com.leeyas.entity.User;

public interface IUserDao {
	 /** 
     * ���� 
     * <br>------------------------------<br> 
     * @param user 
     * @return 
     */  
    boolean add(User user);  
      
    /** 
     * �������� ʹ��pipeline��ʽ 
     * <br>------------------------------<br> 
     * @param list 
     * @return 
     */  
    boolean add(List<User> list);  
      
    /** 
     * ɾ�� 
     * <br>------------------------------<br> 
     * @param key 
     */  
    void delete(String key);  
      
    /** 
     * ɾ����� 
     * <br>------------------------------<br> 
     * @param keys 
     */  
    void delete(List<String> keys);  
      
    /** 
     * �޸� 
     * <br>------------------------------<br> 
     * @param user 
     * @return  
     */  
    boolean update(User user);  
  
    /** 
     * ͨ��key��ȡ 
     * <br>------------------------------<br> 
     * @param keyId 
     * @return  
     */  
    User get(String keyId);  
}
