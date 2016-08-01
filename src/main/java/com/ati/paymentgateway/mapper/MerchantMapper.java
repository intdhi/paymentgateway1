package com.ati.paymentgateway.mapper;

import java.util.List;

import com.ati.paymentgateway.model.Merchant;

public interface MerchantMapper {
	public void insertMerchant (Merchant merchant);
	public List<Merchant> getAllMerchant();
	public Merchant getMerchant(Long id);
	
	public int deleteMerchant(Long id);
	public int updateMerchant(Merchant merchant);
}
