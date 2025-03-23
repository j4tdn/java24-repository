package functional;

import bean.Transaction;
@FunctionalInterface
public interface TransFunc {

	boolean test(Transaction transaction);
	
}
