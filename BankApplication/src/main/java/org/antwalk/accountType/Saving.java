package org.antwalk.accountType;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("saving")
public class Saving implements Account{
	
	public String showAccont()
	{
		return "Savings Account";
	}

}
