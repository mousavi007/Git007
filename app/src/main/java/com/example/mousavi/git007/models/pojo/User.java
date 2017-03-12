package com.example.mousavi.git007.models.pojo;

/**
 * Created by mousavi on 2017/02/13.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("login")
    @Expose
    private static String login;
    @SerializedName("id")
    @Expose
    private static Integer id;
    @SerializedName("avatar_url")
    @Expose
    private static String avatarUrl;
    @SerializedName("gravatar_id")
    @Expose
    private static String gravatarId;
    @SerializedName("url")
    @Expose
    private static String url;
    @SerializedName("html_url")
    @Expose
    private static String htmlUrl;
    @SerializedName("followers_url")
    @Expose
    private static String followersUrl;
    @SerializedName("following_url")
    @Expose
    private static String followingUrl;
    @SerializedName("gists_url")
    @Expose
    private static String gistsUrl;
    @SerializedName("starred_url")
    @Expose
    private static String starredUrl;
    @SerializedName("subscriptions_url")
    @Expose
    private static String subscriptionsUrl;
    @SerializedName("organizations_url")
    @Expose
    private static String organizationsUrl;
    @SerializedName("repos_url")
    @Expose
    private static String reposUrl;
    @SerializedName("events_url")
    @Expose
    private static String eventsUrl;
    @SerializedName("received_events_url")
    @Expose
    private static String receivedEventsUrl;
    @SerializedName("type")
    @Expose
    private static String type;
    @SerializedName("site_admin")
    @Expose
    private static Boolean siteAdmin;
    @SerializedName("name")
    @Expose
    private static Object name;
    @SerializedName("company")
    @Expose
    private static Object company;
    @SerializedName("blog")
    @Expose
    private static Object blog;
    @SerializedName("location")
    @Expose
    private static Object location;
    @SerializedName("email")
    @Expose
    private static Object email;
    @SerializedName("hireable")
    @Expose
    private static Object hireable;
    @SerializedName("bio")
    @Expose
    private static Object bio;
    @SerializedName("public_repos")
    @Expose
    private static Integer publicRepos;
    @SerializedName("public_gists")
    @Expose
    private static Integer publicGists;
    @SerializedName("followers")
    @Expose
    private static Integer followers;
    @SerializedName("following")
    @Expose
    private static Integer following;
    @SerializedName("created_at")
    @Expose
    private static String createdAt;
    @SerializedName("updated_at")
    @Expose
    private static String updatedAt;
    @SerializedName("private_gists")
    @Expose
    private static Integer privateGists;
    @SerializedName("total_private_repos")
    @Expose
    private static Integer totalPrivateRepos;
    @SerializedName("owned_private_repos")
    @Expose
    private static Integer ownedPrivateRepos;
    @SerializedName("disk_usage")
    @Expose
    private static Integer diskUsage;
    @SerializedName("collaborators")
    @Expose
    private static Integer collaborators;
    @SerializedName("two_factor_authentication")
    @Expose
    private static Boolean twoFactorAuthentication;
    @SerializedName("plan")
    @Expose
    private Plan plan;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getCompany() {
        return company;
    }

    public void setCompany(Object company) {
        this.company = company;
    }

    public Object getBlog() {
        return blog;
    }

    public void setBlog(Object blog) {
        this.blog = blog;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getHireable() {
        return hireable;
    }

    public void setHireable(Object hireable) {
        this.hireable = hireable;
    }

    public Object getBio() {
        return bio;
    }

    public void setBio(Object bio) {
        this.bio = bio;
    }

    public Integer getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    public Integer getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getPrivateGists() {
        return privateGists;
    }

    public void setPrivateGists(Integer privateGists) {
        this.privateGists = privateGists;
    }

    public Integer getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    public void setTotalPrivateRepos(Integer totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    public Integer getOwnedPrivateRepos() {
        return ownedPrivateRepos;
    }

    public void setOwnedPrivateRepos(Integer ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
    }

    public Integer getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(Integer diskUsage) {
        this.diskUsage = diskUsage;
    }

    public Integer getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Integer collaborators) {
        this.collaborators = collaborators;
    }

    public Boolean getTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(Boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}
