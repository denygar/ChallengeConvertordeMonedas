public class GetUrl {
    public String generaUrl ( String monedaBase, String monedaFinal, double cantidad){
        String key = "3de02cda6a1b79660e1276ad";// EN VARIABLE DE ENTORNO
        //String key = "___tu key___";
        String monto = Double.toString(cantidad);
        //https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT
        String uri = "https://v6.exchangerate-api.com/v6/"+key+"/pair/"+monedaBase+"/"+monedaFinal+"/"+monto;
        return uri;

    }
}