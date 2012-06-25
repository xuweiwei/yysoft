/**
 * Copyright 2010 YYSoft
 * All right reserved.
 * Created on 2010-5-9
 */
package net.caiban.persist.auth;

import java.util.List;

import net.caiban.domain.auth.Param;

/**
 * @author Mays (x03570227@gmail.com)
 *
 */
public interface ParamDao {
	
	final static short IS_IN_USE = 1;
	final static short IS_NOT_USE = 0;

	/**
	 * @param used:用于表示参数状态<br/>
	 * 		null表示获取所有参数,1表示正常状态的参数,0表示禁用状态的参数
	 * @return
	 */
	public List<Param> listAllParam(Short used);
	
}
