package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.JobTitleService;
import hrmsproject.hrms.core.utilities.result.DataResult;
import hrmsproject.hrms.core.utilities.result.Result;
import hrmsproject.hrms.core.utilities.result.SuccessDataResult;
import hrmsproject.hrms.core.utilities.result.SuccessResult;
import hrmsproject.hrms.dataAccess.abstracts.JobTitleDao;
import hrmsproject.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {

		return new SuccessDataResult<>(this.jobTitleDao.findAll());
	}

	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("İş pozisyonu eklendi");
	}

}
