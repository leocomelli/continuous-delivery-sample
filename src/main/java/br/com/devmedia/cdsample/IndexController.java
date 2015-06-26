package br.com.devmedia.cdsample;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private VersionManager versionManager;


	@Autowired
	public IndexController(VersionManager versionManager) {
		this.versionManager = versionManager;
	}
	
	
	@RequestMapping(value = "/", method = GET)
	public String index(ModelMap map) {
		map.put("appversion", versionManager.manage());		
		return "index";
	}

}
