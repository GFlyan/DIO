public class ParametrosInvalidosExcpetion extends Exception{

    private String exception = "--------------------------------------------------\n" +
                               "O segundo parâmetro deve ser maior que o primeiro.\n" +
                               "--------------------------------------------------";

    public String getException() {
        return exception;
    }
}
