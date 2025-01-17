package com.dabsquared.gitlabjenkins.trigger.handler.note;

import com.dabsquared.gitlabjenkins.gitlab.hook.model.NoteHook;
import com.dabsquared.gitlabjenkins.trigger.filter.BranchFilter;
import com.dabsquared.gitlabjenkins.trigger.filter.MergeRequestLabelFilter;
import com.dabsquared.gitlabjenkins.trigger.filter.UserNameFilter;
import hudson.model.Job;

/**
 * @author Robin Müller
 */
class NopNoteHookTriggerHandler implements NoteHookTriggerHandler {
    @Override
    public void handle(Job<?, ?> job, NoteHook hook, boolean ciSkip, BranchFilter branchFilter, MergeRequestLabelFilter mergeRequestLabelFilter, UserNameFilter userNameFilter) {
        // nothing to do
    }
}
