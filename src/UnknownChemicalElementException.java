public class UnknownChemicalElementException extends Exception {
    UnknownChemicalElementException(String symbol) {
        super("Unknown chemical element symbol \'" + symbol + "\'");
    }
}