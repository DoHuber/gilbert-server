import com.password4j.Argon2Function;
import com.password4j.Hash;
import com.password4j.Password;

public class GenerateHash {

    public static void main(String[] args) {

        Argon2Function hashFunc = Argon2Function.getInstance(
                Argon2Params.MEMORY,
                Argon2Params.ITERATIONS,
                Argon2Params.PARALLELIZATION,
                Argon2Params.OUTPUT_LENGTH,
                Argon2Params.TYPE,
                Argon2Params.VERSION
        );

        String input = "aaaaa";
        Hash hash = Password.hash(input).addRandomSalt().with(hashFunc);
        System.out.println(hash.getResult());

        String copiedHash = "none";
        boolean succ = Password.check(input, copiedHash).with(hashFunc);
        System.out.println("The result is: " + succ);

    }
}
