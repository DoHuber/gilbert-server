import static spark.Spark.*;

public class GilbertServer {

    private final static String authToken = "abcdef";

    public static void main(String[] args) {

        get("/hello", (req, res) -> {

            return "Hello World!";

        });
    }


}
