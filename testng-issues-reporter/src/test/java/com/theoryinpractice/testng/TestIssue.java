/*
 * 
 * Created by IntelliJ IDEA.
 * User: amrk
 * Date: 7/10/2006
 * Time: 16:59:00
 */
package com.theoryinpractice.testng;

import org.testng.annotations.Test;

@RelatedIssueSource("http://jira.somewhere.net")
public class TestIssue {

    @Test(enabled = false)
    @RelatedIssues("TEST-73")
    public void testSomething() {
        assert false : "Test failed - boo hoo go cry to mother...";
    }

    @Test(enabled = false)
    @RelatedIssues("TEST-74")
    public void testSomethingElse() {
        assert false : "Test failed - boo hoo go cry to mother...";
    }

}
