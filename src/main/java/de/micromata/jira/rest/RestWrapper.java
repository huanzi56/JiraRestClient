package de.micromata.jira.rest;



import java.net.URI;
import java.util.List;

import de.micromata.jira.rest.domain.BasicProjectBean;
import de.micromata.jira.rest.domain.CommentSummaryBean;
import de.micromata.jira.rest.domain.ComponentBean;
import de.micromata.jira.rest.domain.IssueBean;
import de.micromata.jira.rest.domain.IssueTypeBean;
import de.micromata.jira.rest.domain.JqlSearchResultBean;
import de.micromata.jira.rest.domain.ProjectBean;
import de.micromata.jira.rest.domain.StatusBean;
import de.micromata.jira.rest.domain.VersionBean;
import de.micromata.jira.rest.jql.JqlSearchBean;
import de.micromata.jira.rest.util.RestException;

/**
 * Created with IntelliJ IDEA.
 * User: Christian
 * Date: 28.02.13
 * Time: 11:18
 * To change this template use File | Settings | File Templates.
 */
public interface RestWrapper {


    public List<BasicProjectBean> getAllProjects(JiraRestClient jiraRestClient) throws RestException;

    public ProjectBean getProjectByKey(JiraRestClient jiraRestClient, String projectKey) throws RestException;

    public JqlSearchResultBean getIssuesForProject(JiraRestClient jiraRestClient, String projectKey) throws RestException;

    public List<IssueBean> searchIssuesForProject(JiraRestClient jiraRestClient, JqlSearchBean jqlBean) throws RestException;

    public IssueBean getIssueByKey(JiraRestClient jiraRestClient, String issueKey) throws RestException;

    public boolean testRestConnection(URI uri, String username, String password);

	public CommentSummaryBean getCommentsByIssue(JiraRestClient jiraRestClient,
			String issueKey) throws RestException;

	public List<VersionBean> getProjectVersions(JiraRestClient jiraRestClient,
			String projectKey) throws RestException;

	public List<ComponentBean> getProjectComponents(JiraRestClient jiraRestClient,
			String projectKey) throws RestException;

    public List<IssueTypeBean> getIssueTypes(JiraRestClient jiraRestClient) throws RestException;

    public List<StatusBean> getStates(JiraRestClient jiraRestClient) throws RestException;

	public List<IssueBean> extendedSearchIssuesForProject(
			JiraRestClient jiraRestClient, JqlSearchBean jqlBean) throws RestException;
}
