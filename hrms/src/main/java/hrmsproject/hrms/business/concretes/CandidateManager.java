package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hrmsproject.hrms.business.abstracts.CandidateService;
import hrmsproject.hrms.core.utilities.result.DataResult;
import hrmsproject.hrms.core.utilities.result.SuccessDataResult;
import hrmsproject.hrms.dataAccess.abstracts.CandidateDao;
import hrmsproject.hrms.entities.concretes.Candidate;

public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll());
	}

}
