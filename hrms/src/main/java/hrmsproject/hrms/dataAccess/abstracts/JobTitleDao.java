package hrmsproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsproject.hrms.entities.concretes.JobTitles;

public interface JobTitleDao extends JpaRepository<JobTitles, Integer> {

}
