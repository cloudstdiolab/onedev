package com.gitplex.core.event.pullrequest;

import java.util.Date;

import com.gitplex.core.entity.Account;
import com.gitplex.core.entity.PullRequestUpdate;
import com.gitplex.commons.wicket.editable.annotation.Editable;

@Editable(name="has new commits")
public class PullRequestUpdated extends PullRequestChangeEvent {

	private final PullRequestUpdate update;
	
	public PullRequestUpdated(PullRequestUpdate update) {
		super(update.getRequest());
		this.update = update;
	}

	public PullRequestUpdate getUpdate() {
		return update;
	}

	@Override
	public Account getUser() {
		return null;
	}

	@Override
	public Date getDate() {
		return update.getDate();
	}

}