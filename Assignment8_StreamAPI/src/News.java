
public class News {
	private int newsId;
	private String postedBYUser;
	private String commentByUser;
	private String comment;
	public News(int newsId, String postedBYUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedBYUser = postedBYUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedBYUser() {
		return postedBYUser;
	}
	public void setPostedBYUser(String postedBYUser) {
		this.postedBYUser = postedBYUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedBYUser=" + postedBYUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
