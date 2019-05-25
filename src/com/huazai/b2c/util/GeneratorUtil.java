package com.huazai.b2c.util;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 
 * @description
 *              <li>MyBatis generator工具类
 * @class_name GeneratorUtil
 * @package com.huazai.b2c.util
 * @created 2017年5月25日 下午8:52:54
 * @contact who.seek.me@java98k.vip
 *
 * @version V1.0.0
 * @author HuaZai
 */
public class GeneratorUtil
{
	public static void generatro() throws Exception
	{
		List<String> warnings = new ArrayList<>();
		boolean overwrite = true;
		// 通过 file 读取逆向工程配置文件
		File gCofig = new File("generator-Config.xml");
		ConfigurationParser cParser = new ConfigurationParser(warnings);
		Configuration configuration = cParser.parseConfiguration(gCofig);
		DefaultShellCallback shellCallback = new DefaultShellCallback(overwrite);
		// 配置mybatisgenerator
		MyBatisGenerator generator = new MyBatisGenerator(configuration, shellCallback, warnings);
		generator.generate(null);
	}

}
