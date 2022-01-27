package hrmsproject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsproject.hrms.business.abstracts.JobTitleService;
import hrmsproject.hrms.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class JobController {

	@Autowired
	private JobTitleService jobTitleService;

	public JobController(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}

	@GetMapping("/getall")
	public List<JobTitles> getAll() {
		return this.jobTitleService.getAll();
	}

}
