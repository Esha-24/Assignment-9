package org.antwalk.accountType;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{
	
	public String showAccont()
	{
		return "Current Account.";
	}
}
