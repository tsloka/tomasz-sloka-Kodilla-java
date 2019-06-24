package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void testZeroPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new LinkedList<>();
        userNames.add("user1");
        userNames.add("user2");
        int postsCount = 0;
        int commentsCount = 50;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getUserPostsAvg(), 0.001);
        Assert.assertEquals(25, forumStatistics.getUserCommentsAvg(), 0.001);
        Assert.assertEquals(0, forumStatistics.getPostCommentsAvg(), 0.001);
    }

    @Test
    public void testThousandPostsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new LinkedList<>();
        userNames.add("user1");
        userNames.add("user2");
        int postsCount = 1000;
        int commentsCount = 50;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(500, forumStatistics.getUserPostsAvg(), 0.001);
        Assert.assertEquals(25, forumStatistics.getUserCommentsAvg(), 0.001);
        Assert.assertEquals(0.05, forumStatistics.getPostCommentsAvg(), 0.000001);
    }

    @Test
    public void testZeroCommentsCount() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new LinkedList<>();
        userNames.add("user1");
        userNames.add("user2");
        int postsCount = 1000;
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(500, forumStatistics.getUserPostsAvg(), 0.001);
        Assert.assertEquals(0, forumStatistics.getUserCommentsAvg(), 0.001);
        Assert.assertEquals(0, forumStatistics.getPostCommentsAvg(), 0.0001);
    }

    @Test
    public void testLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new LinkedList<>();
        userNames.add("user1");
        userNames.add("user2");
        int postsCount = 1000;
        int commentsCount = 100;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(500, forumStatistics.getUserPostsAvg(), 0.001);
        Assert.assertEquals(50, forumStatistics.getUserCommentsAvg(), 0.001);
        Assert.assertEquals(0.1, forumStatistics.getPostCommentsAvg(), 0.0001);
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new LinkedList<>();
        userNames.add("user1");
        userNames.add("user2");
        int postsCount = 10;
        int commentsCount = 50;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, forumStatistics.getUserPostsAvg(), 0.001);
        Assert.assertEquals(25, forumStatistics.getUserCommentsAvg(), 0.001);
        Assert.assertEquals(5, forumStatistics.getPostCommentsAvg(), 0.0001);
    }

    @Test
    public void testZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new LinkedList<>();
        int postsCount = 10;
        int commentsCount = 10;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getUserPostsAvg(), 0.001);
        Assert.assertEquals(0, forumStatistics.getUserCommentsAvg(), 0.001);
        Assert.assertEquals(1, forumStatistics.getPostCommentsAvg(), 0.0001);
    }

    @Test
    public void testHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            userNames.add("user" + i);
        }
        int postsCount = 100;
        int commentsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1, forumStatistics.getUserPostsAvg(), 0.001);
        Assert.assertEquals(10, forumStatistics.getUserCommentsAvg(), 0.001);
        Assert.assertEquals(10, forumStatistics.getPostCommentsAvg(), 0.0001);
    }
}
