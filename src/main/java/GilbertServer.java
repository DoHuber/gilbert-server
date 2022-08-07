import spark.Request;

import static spark.Spark.*;

public class GilbertServer {

    private final static String authToken = "abcdef";

    private static void checkAuth(Request req) {
        String suppliedToken = req.queryParams("token");
        if (!authToken.equals(suppliedToken)) {
            halt(401, "Bad token.");
        }
    }

    public static void main(String[] args) {

        before((req, response) -> {
            checkAuth(req);
        });

        get("/hello", (req, res) -> {

            return "Hello World!";

        });
    }


}
