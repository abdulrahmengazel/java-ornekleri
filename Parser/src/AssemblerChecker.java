import java.util.List;


public class AssemblerChecker {

    public static final List<String> commands = List.of(
            "TOP", "CRP", "BOL", "CIK", "D", "DB", "DK", "DKE", "DBE", "DED", "DE",
            "HRK", "VE", "VEY", "DEG", "OKU", "YAZ"
    );

    public static final List<String> operands = List.of(
            "AX", "BX", "CX", "DX","OP1,","OP2","OP"
    );

    public static final List<String> Etiket = List.of(
            "ETIKET", "ETIKET1", "ETIKET2", "ETIKET3", "ETIKET4", "ETIKET5", "ETIKET6",
            "ETIKET7", "ETIKET8", "ETIKET9", "ETIKET10"
    );



    public static boolean checkSyntax(String line ,int lineNumber) {
        String[] tokens = line.split("\\s+");

        if (tokens.length == 0) {
            reportError(lineNumber, "Boş bir satır.");
            return false;
        }

        String command = tokens[0];
        if (!commands.contains(command)) {
            reportError(lineNumber, "Bilinmeyen komut: " + command);
            return false;
        }

        if (commandsWithTwoOperands.contains(command)) {
            if (tokens.length != 3 || !isValidOperand(tokens[1]) ||!isValidOperand(tokens[2])) {
                reportError(lineNumber, "Geçersiz iki operand yapılandırması.");
                return false;
            }
        } else if (commandsWithOneOperand.contains(command)) {
            if (tokens.length != 2 || !isValidOperand(tokens[1])) {
                reportError(lineNumber, "Geçersiz operand yapılandırması.");

                return false;
            }
        } else if (commandsWithLabel.contains(command)) {
            if (tokens.length != 2 || !isValidLabel(tokens[1])) {
                reportError(lineNumber, "Geçersiz etiket yapılandırması.");

                return false;
            }
        }


        return true;

    }

    public static boolean isValidOperand(String operand) {
        return operands.contains(operand) || operand.matches("\\[\\d+\\]");
    }

    public static boolean isValidLabel(String label) {
        return Etiket.contains(label);
    }

    public static final List<String> commandsWithTwoOperands = List.of(
            "TOP", "CRP", "BOL", "CIK", "VE", "VEY"
    );

    public static final List<String> commandsWithOneOperand = List.of(
            "HRK", "DEG", "OKU", "YAZ"
    );

    public static final List<String> commandsWithLabel = List.of(
            "D", "DB", "DK", "DKE", "DBE", "DED", "DE"
    );

    private static void reportError(int lineNumber, String message) {
        System.out.println("Satır " + lineNumber + ": " + message);
    }
}