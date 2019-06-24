package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double userPostsAvg;
    private double userCommentsAvg;
    private double postCommentsAvg;

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount != 0 && postsCount != 0 && commentsCount != 0) {
            userPostsAvg = postsCount / usersCount;
            userCommentsAvg = commentsCount / usersCount;
            postCommentsAvg = commentsCount / postsCount;
        } else {
            if (usersCount == 0) {
                userPostsAvg = 0;
                userCommentsAvg = 0;
                postCommentsAvg = commentsCount / postsCount;
            }
            if (postsCount == 0) {
                userPostsAvg = 0;
                userCommentsAvg = commentsCount / usersCount;
                postCommentsAvg = 0;
            }
            if (commentsCount == 0){
                userPostsAvg = postsCount / usersCount;
                userCommentsAvg = 0;
                postCommentsAvg = 0;
            }
        }
    }

    public void showStatistics() {
        System.out.println("Forum statistics: /n" + "Total number of users: " + usersCount +
                "/n Total number of posts: " + postsCount +
                "/n Total number of comments: " + commentsCount +
                "/n Average posts count per user: " + userPostsAvg +
                "/n Average comments count per user: " + userCommentsAvg +
                "/n Average comments count per post: " + postCommentsAvg);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getUserPostsAvg() {
        return userPostsAvg;
    }

    public double getUserCommentsAvg() {
        return userCommentsAvg;
    }

    public double getPostCommentsAvg() {
        return postCommentsAvg;
    }
}