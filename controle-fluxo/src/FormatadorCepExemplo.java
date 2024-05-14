public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("23765964");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O cep não corresponde com as regras de negocio.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
        throw new CepInvalidException();

        return "23.765-064";
    }
}
