package com.ati.paymentgateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ati.paymentgateway.mapper.MerchantMapper;
import com.ati.paymentgateway.model.Merchant;

@Service("mechantService")
public class MerchantServiceImpl implements MerchantService  {
	@Autowired
	private MerchantMapper merchantMapper;
		
	@Transactional
	public void insertMerchant(Merchant merchant) {
		merchantMapper.insertMerchant(merchant);
	}

	@Override
	public List<Merchant> getAllMerchant() {
		return merchantMapper.getAllMerchant();
	}

	@Override
	public Merchant getMerchant(Long id) {
		return merchantMapper.getMerchant(id);
	}

	@Transactional
	public int deleteMerchant(Long id) {
		return merchantMapper.deleteMerchant(id);
	}

	@Override
	public int updateMerchant(Merchant merchant) {
		return merchantMapper.updateMerchant(merchant);
	}
}
