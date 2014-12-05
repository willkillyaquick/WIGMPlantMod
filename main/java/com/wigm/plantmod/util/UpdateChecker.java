/**
 * 
 */
package com.wigm.plantmod.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
import com.wigm.plantmod.lib.Constants;

/**
 * @author Thomas Snyder (willkillyaquick)
 * @version Nov 19, 2014
 *
 */



public class UpdateChecker {
	public static String checkForUpdates(){
		
		return getNewest();
		
	}
	/**
	 * @return
	 */
	private static String getNewest() {
		String line;
		StringBuffer response = new StringBuffer();
		StringBuffer newestVersion = new StringBuffer();
		try
		{
			
			URL url = new URL("https://raw.githubusercontent.com/willkillyaquick/WIGMPlantMod/master/changes/newest.txt");
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1); AppleWebKit/535.11 (KHTML, like Gecko) Chrome/17.0.963.56 Sarfari/535.11");
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			InputStream is = connection.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			
			if ((line = br.readLine()) != null)
			{
				response.append(line);
			}
			if (Integer.parseInt(response.toString()) > Constants.modReleasedNumber){
				while ((line = br.readLine()) != null){
					newestVersion.append(line);
				}
				newestVersion.append(" Your version you have installed is " + Constants.VERSION + ".");
			}
			else
			{
				newestVersion.append("WIGM Plant mod is up to date");
			}
			br.close();
			System.out.println(newestVersion);
			return newestVersion.toString();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		newestVersion.append("WIGM Plant mod is up to date");
		return newestVersion.toString();
	}
}
