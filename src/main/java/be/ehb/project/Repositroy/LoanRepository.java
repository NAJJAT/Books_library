package be.ehb.project.Repositroy;

import be.ehb.project.model.Loans;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository  extends CrudRepository<Loans, Integer> {


}