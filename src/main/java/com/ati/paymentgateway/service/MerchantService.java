package com.ati.paymentgateway.service;

import java.util.List;

import com.ati.paymentgateway.model.Merchant;
public interface MerchantService {
	public void insertMerchant(Merchant merchant);
	public List<Merchant> getAllMerchant();
	public Merchant getMerchant(Long id);
	public int deleteMerchant(Long id);
	public int updateMerchant(Merchant merchant);
}
