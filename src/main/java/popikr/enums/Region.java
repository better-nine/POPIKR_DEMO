package popikr.enums;

public enum Region implements EnumMapperType{
    SEOUL("서울");

    private String title;
    Region(String title) { this.title = title; }

    @Override
    public String getCode() { return name(); }
    @Override
    public String getTitle() { return title; }
}
