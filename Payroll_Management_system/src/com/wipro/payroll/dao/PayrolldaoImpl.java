package com.wipro.payroll.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wipro.payroll.model.PayrollBean;

@Repository("Payrolldao")
public abstract class PayrolldaoImpl implements Payrolldao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String doRegister(PayrollBean payroll) {
		sessionFactory.getCurrentSession().save(payroll);
		return "payroll";
	}
	

	

	

	

}
