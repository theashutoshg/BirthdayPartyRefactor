package scrap.heap.refactor.domain.constants;

public enum Material {
  MYLAR("mylar"),
  LATEX("latex");

  private String getMaterialType;

  Material(String materialType) {
    this.getMaterialType = materialType;
  }

    public static Material fromString(String text) {
        return Material.valueOf(text.toUpperCase());
    }

  public String getMaterialType() {
    return getMaterialType;
  }
}
