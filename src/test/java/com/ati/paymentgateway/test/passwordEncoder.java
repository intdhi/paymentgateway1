package com.ati.paymentgateway.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordEncoder {
		public static void main(String[] args) {

			int i = 0;
			while (i < 10) {
				String password = "bb";
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				String hashedPassword = passwordEncoder.encode(password);

				System.out.println(hashedPassword);
				i++;
			}

		}
}
