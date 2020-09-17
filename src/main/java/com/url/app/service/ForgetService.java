package com.url.app.service;

import org.springframework.stereotype.Service;

@Service
public class ForgetService implements IForget {

	@Override
	public void byMob(String mob) {
		System.out.println("Select # from Conmsumer where mobile=:"+mob);

	}

	@Override
	public void byMobEmail(String mob, String email) {
		System.out.println("Select # from Conmsumer where mobile=:"+mob+"AND EMAIL : "+email);

	}

}
