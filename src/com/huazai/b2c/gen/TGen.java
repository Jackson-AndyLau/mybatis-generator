package com.huazai.b2c.gen;

import com.huazai.b2c.util.GeneratorUtil;

/**
 * 
 * @description
 *              <li>启动类
 * @class_name TGen
 * @package com.huazai.b2c.gen
 * @created 2017年5月25日 下午9:10:31
 * @contact who.seek.me@java98k.vip
 *
 * @version V1.0.0
 * @author HuaZai
 */
public class TGen
{
	public static void main(String[] args)
	{
		try
		{
			GeneratorUtil.generatro();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
