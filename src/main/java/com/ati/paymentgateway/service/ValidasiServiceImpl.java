package com.ati.paymentgateway.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ati.paymentgateway.model.Validasi;


@Service("validasiService")
public class ValidasiServiceImpl implements ValidasiService{

	@Override
	public void insertValidasi(Validasi validasi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Validasi> getAllValidasi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Validasi getValidasi(Long id) {
		// TODO Auto-generated method stub
		RestTemplate restTemplate = new RestTemplate();
		Validasi validasi= restTemplate.getForObject("10.50.50.51:8080/webservice5/validasi/17",Validasi.class);
		return validasi;
	}

	@Override
	public int updateValidasi(Validasi validasi) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteValidasi(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
