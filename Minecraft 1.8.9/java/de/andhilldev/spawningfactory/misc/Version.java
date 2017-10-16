package de.andhilldev.spawningfactory.misc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Version extends Thread {
	
	public static String remoteVersion;
	public static String installedVersion;
	public static String remoteIntVersion;
	public static String installedIntVersion;
	public static int iVersion;
	public static int rVersion;
	public static boolean hasNewVersion = false;
	

	public Version() {
		installedVersion = References.MODVERSION;
		installedIntVersion = installedVersion.replaceAll("\\.", "");
		iVersion = Integer.parseInt(installedIntVersion);
		try {
			
			URL url = new URL("http://www.andhilldev.de/mods/" + References.MODID + "/version189/version.txt");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader((InputStream) conn.getContent()));
			remoteVersion = reader.readLine();
			
			remoteIntVersion = remoteVersion.replaceAll("\\.", "");
			rVersion = Integer.parseInt(remoteIntVersion);
			
			if(rVersion > iVersion){
				hasNewVersion = true;
			}
			else
			{
				hasNewVersion = false;
			}
		} catch(Exception e) {
			System.out.println("The updatechecker is not able to check for a new version\n"+e.getLocalizedMessage());
		}
	}

}
