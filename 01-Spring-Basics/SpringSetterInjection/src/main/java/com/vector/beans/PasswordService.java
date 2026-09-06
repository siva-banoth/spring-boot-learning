package com.vector.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	
	public String encodePasword(String password) {
		
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(password.getBytes());
	}
	
	public String decodePassword(String password) {
		Decoder  decoder = Base64.getDecoder();
		byte[] b = decoder.decode(password);
		return new String(b);
	}

}
