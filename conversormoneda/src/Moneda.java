public record Moneda(String base_code,
                     String target_code,
                     double conversion_result) {

    @Override
    public String toString() {
        return " equivalen a "+conversion_result+" "+target_code;
    }
}
