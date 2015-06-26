package br.com.devmedia.cdsample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class VersionManager {

	@Value("${appversion}")
	private String version;
	
	public String manage(){
		
		// Perform something here!
		
		return version;
	}
	
}
