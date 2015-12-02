package com.leave.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.leave.entity.LeaveEntity;

@Repository
public class LeaveDaoImpl implements LeaveDAO {

	private SessionFactory sessionFactory;

	@Override
	public void addLeave(LeaveEntity leave) {
		this.sessionFactory.getCurrentSession().save(leave);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LeaveEntity> getAllLeaves() {
		return this.sessionFactory.getCurrentSession().createQuery("from LeaveEntity").list();
	}

	@Override
	public void approveLeave(Integer leaveId) {
		LeaveEntity leave = (LeaveEntity) sessionFactory.getCurrentSession().load(LeaveEntity.class, leaveId);
		if (null != leave) {
			leave.setStatus("Approved");
		}
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
