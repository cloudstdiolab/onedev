package com.gitplex.core.event.pullrequest;

import com.gitplex.core.entity.PullRequestReviewInvitation;

public class PullRequestReviewInvitationChanged extends PullRequestEvent {

	private final PullRequestReviewInvitation invitation;
	
	public PullRequestReviewInvitationChanged(PullRequestReviewInvitation invitation) {
		super(invitation.getRequest());
		this.invitation = invitation;
	}

	public PullRequestReviewInvitation getInvitation() {
		return invitation;
	}

}