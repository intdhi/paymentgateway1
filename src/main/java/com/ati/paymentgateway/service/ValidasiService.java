package com.ati.paymentgateway.service;

import java.util.List;

import com.ati.paymentgateway.model.Validasi;

public interface ValidasiService {
	public void insertValidasi(Validasi validasi);
	public List<Validasi> getAllValidasi();
	public Validasi getValidasi(Long id);
	public int updateValidasi(Validasi validasi);
	public int deleteValidasi (Long id);

}
