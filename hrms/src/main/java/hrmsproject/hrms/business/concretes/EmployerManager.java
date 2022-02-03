package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrmsproject.hrms.business.abstracts.EmployerService;
import hrmsproject.hrms.core.utilities.result.DataResult;
import hrmsproject.hrms.core.utilities.result.SuccessDataResult;
import hrmsproject.hrms.dataAccess.abstracts.EmployerDao;
import hrmsproject.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

}
