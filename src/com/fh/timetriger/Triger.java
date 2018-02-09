package com.fh.timetriger;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Triger {
	
	// 每分钟的第20s执行一次
	//@Scheduled(cron = "*/5 * * * * *")
	public void clearTokenTime() {
		 System.out.println("定时器执行");
	}
}
