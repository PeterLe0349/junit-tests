import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CodeupCrypt {
    static double version;

    public static String hashPassword(String str){
//        String str2 = "";
                str = str.replace("a", "4");
                str = str.replace("A", "4");
                str = str.replace("e", "3");
                str = str.replace("E", "3");
                str = str.replace("i", "1");
                str = str.replace("I", "1");
                str = str.replace("o", "0");
                str = str.replace("O", "0");
                str = str.replace("u", "9");
                str = str.replace("U", "9");
                return str;

    }

    public static boolean checkPassword(String str1, String str2){
        return str2.equals(hashPassword(str1));
    }
}
