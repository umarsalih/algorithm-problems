
public class TVShows {
	public String tvShowName;
	public String tvShowProducer;
	public double rating;
	public boolean isOngoing;
	
	public String getTvShowName() {
		return tvShowName;
	}
	public void setTvShowName(String tvShowName) {
		this.tvShowName = tvShowName;
	}
	
	public String getTvShowProducer() {
		return tvShowProducer;
	}
	public void setTvShowProducer(String tvShowProducer) {
		this.tvShowProducer = tvShowProducer;
	}
	
	
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
	public boolean isOngoing() {
		return isOngoing;
	}
	public void setOngoing(boolean isOngoing) {
		this.isOngoing = isOngoing;
	}
	
	
	@Override
	public String toString() {
		return "TVShows [tvShowName=" + tvShowName + ", tvShowProducer=" + tvShowProducer + ", rating=" + rating
				+ ", isOngoing=" + isOngoing + "]";
	}
	
	

}
