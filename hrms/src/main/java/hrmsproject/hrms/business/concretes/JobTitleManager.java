package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.JobTitleService;
import hrmsproject.hrms.dataAccess.abstracts.JobTitleDao;
import hrmsproject.hrms.entities.concretes.JobTitles;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitles> getAll() {
		// TODO Auto-generated method stub
		return this.jobTitleDao.findAll();
	}

}
