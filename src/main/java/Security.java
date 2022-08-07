import com.password4j.Argon2Function;
import com.password4j.Password;

public class Security {

    private static final String correctHash = "$argon2id$v=19$m=16384,t=20,p=2$77+977+977+9dXZ6LGDPoe+/vWEuJN6HYhoLGUjvv73vv70xbe+/vRDvv73vv73vv73vv73vv73vv73vv73vv73vv71v77+9dldLNFNGeG9HRylD0YHvv73vv71c77+9f++/ve+/vdSNf3sd$oFQuYSdQFP4JoLIOcENILGzIOetKuuVYjzLGW1qT0UE";
    private final Argon2Function hashFunc = Argon2Function.getInstance(
            Argon2Params.MEMORY,
            Argon2Params.ITERATIONS,
            Argon2Params.PARALLELIZATION,
            Argon2Params.OUTPUT_LENGTH,
            Argon2Params.TYPE,
            Argon2Params.VERSION
    );

    public boolean checkPassword(String password) {
        return Password.check(password, correctHash).with(hashFunc);
    }



}
