/**
 * Company:	F-space
 * Project Name:fun-user-manage 
 * File Name:UserApplication.java 
 * Package Name:com.fun 
 * Date:2018年8月20日下午6:11:00 
 * Copyright (C) 2016,F-space. All rights reserved.
 * 
 */
package com.fun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * ClassName: UserApplication <br/>
 * Function: Server start. <br/>
 * date: 2018年8月20日 下午6:11:00 <br/>
 * 
 * @author lishuai11
 * @version
 * @since JDK 1.8
 */
@SpringBootApplication
//@EnableDiscoveryClient
@EnableJpaAuditing
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}
