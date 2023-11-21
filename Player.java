public class Player {
    private int goals;
    private String name;
    private String nationality;
    private int rating;

    // Constructeur
    public Player(int goals, String name, String nationality, int rating) {
        this.goals = goals;
        this.name = name;
        this.nationality = nationality;
        this.rating = rating;
    }

    // Méthodes d'accès (getters et setters)
    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Méthode pour afficher les détails du joueur
    public void displayPlayerDetails() {
        System.out.println("Player: " + name);
        System.out.println("Nationality: " + nationality);
        System.out.println("Goals: " + goals);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        // Exemple d'utilisation de la classe Player
        Player player1 = new Player(30, "Cristiano Ronaldo", "Portugal", 95);
        player1.displayPlayerDetails();

        Player player2 = new Player(25, "Lionel Messi", "Argentina", 94);
        player2.displayPlayerDetails();
    }
}
