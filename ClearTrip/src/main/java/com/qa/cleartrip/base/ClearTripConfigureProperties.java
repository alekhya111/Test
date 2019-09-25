package com.qa.cleartrip.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import cm.qa.cleartrip.utils.ClearTripConstantUtils;

public class ClearTripConfigureProperties {
	public static FileInputStream fi;
	public static Properties prop;
	public static String browserName;

	public static String init() throws Exception {

		fi = new FileInputStream(new File(ClearTripConstantUtils.properties_File_Path));
		prop = new Properties();
		prop.load(fi);

		browserName = prop.getProperty("browser");
		return browserName;
	}

}
