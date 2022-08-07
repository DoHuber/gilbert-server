import spark.Request;

import static spark.Spark.*;

public class GilbertServer {

    private static void checkAuth(Request req) {
        String suppliedToken = req.queryParams("token");
        Security security = new Security();
        if (!security.checkPassword(suppliedToken)) {
            halt(401, "Bad auth token.");
        }
    }

    public static void main(String[] args) {

        before((req, response) -> checkAuth(req));
        get("/hello", (req, res) -> "Hello World!");
        get("messages-since", (req, res) -> "Ahhhhh");

    }

    // Roadmap - need message submit endpoint, and message get endpoint
    // For this, we first need database connectivity
    // Workflow: Check auth, then store/yield messages


}
