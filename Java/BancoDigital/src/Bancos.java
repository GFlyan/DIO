import sistemaBancario.Banco;
import sistemaBancario.NomeBancos;

public class Bancos {
    public static Banco santander = new Banco(NomeBancos.SANTANDER, 1);
    public static Banco bradesco = new Banco(NomeBancos.BRADESCO, 2);
    public static Banco itau = new Banco(NomeBancos.ITAU, 3);
    public static Banco inter = new Banco(NomeBancos.INTER, 4);
    public static Banco nubank = new Banco(NomeBancos.NUBANK, 5);
    public static Banco picpay = new Banco(NomeBancos.PICPAY, 6);
    public static Banco c6bank = new Banco(NomeBancos.C6BANK, 7);
}
