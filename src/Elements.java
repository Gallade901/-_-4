public enum Elements {
    wind("воздух"),
    water("вода"),
    fire("огонь"),
    earth("земля");
    private String translation;
    Elements(String translation) {
        this.translation = translation;
    }
    public String getTranslationt() {
        return translation;
    }
}
