package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.utilities.result.DataResult;
import hrmsproject.hrms.core.utilities.result.Result;
import hrmsproject.hrms.entities.concretes.JobTitle;

public interface JobTitleService {

	DataResult<List<JobTitle>> getAll();
	Result add(JobTitle jobTitle);
}
