package popikr.enums;

public enum Kind implements EnumMapperType{
    POPUP("팝업"),
    EXHIBITION("전시");

    private String title;
    Kind(String title) { this.title = title; }

    @Override
    public String getCode() { return name(); }
    @Override
    public String getTitle() { return title; }
}
