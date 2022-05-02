package softwareDeveloperClubProjects;

public class ClubMember {
	String name;
	String city;
	String state;
	String favoriteLanguage;
	
	ClubMember(String newName, String newCity, String newState, String newFavoriteLanguage) {
		this.name = newName;
		this.city = newCity;
		this.state = newState;
		this.favoriteLanguage = newFavoriteLanguage;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	@Override
	public String toString() {
		return "Name: "+ name +"\nLocation: " + city + ", " + state + "\nFavorite Language: " + favoriteLanguage +"\n\n";
	}
	
}
