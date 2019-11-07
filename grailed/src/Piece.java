public class Piece {
    private String name;
    private String url;

    Piece(String name, String url) {
        this.name = name;
        this.url = url;
    }

    String getName() {
        return(this.name);
    }

    String getUrl() {
        return(this.url);
    }
}
