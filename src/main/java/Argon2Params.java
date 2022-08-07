import com.password4j.types.Argon2;

public class Argon2Params {
    // following recommendations from https://cheatsheetseries.owasp.org/cheatsheets/Password_Storage_Cheat_Sheet.html
    public static final int MEMORY = 16 * 1024; // in kilobytes, we want 16 MB
    public static final int ITERATIONS = 20;
    public static final int PARALLELIZATION = 2;
    public static final int OUTPUT_LENGTH = 32;
    public static final Argon2 TYPE = Argon2.ID;
    public static final int VERSION = 19;
}
