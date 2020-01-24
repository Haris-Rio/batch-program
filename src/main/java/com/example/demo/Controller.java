package com.example.demo;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value = "/cmd")
	public void OpenCloseCmd() throws InterruptedException {
	try {
		final String location = "C:\\bat";
		Runtime.getRuntime().exec("cmd /c start \"\" echo.bat", null, new File(location));
		Thread.sleep(5000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}

