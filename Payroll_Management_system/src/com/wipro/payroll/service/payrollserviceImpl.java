package com.wipro.payroll.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.payroll.dao.Payrolldao;
import com.wipro.payroll.model.PayrollBean;


@Service("payrollservice")
public class payrollserviceImpl implements payrollservice {

	@Autowired
	private Payrolldao payrolldao;

	@Transactional
	//@Override
	public String doRegister(PayrollBean pay) {
		return Payrolldao.doRegister(pay);
	}

}
