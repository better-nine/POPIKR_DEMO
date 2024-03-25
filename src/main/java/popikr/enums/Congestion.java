package popikr.enums;

public enum Congestion implements EnumMapperType{
    FREE("여유"),
    NORMAL("보통"),
    CROWDED("붐빔"),
    CHAOS("혼잡");

    private String title;
    Congestion(String title) { this.title = title; }

    @Override
    public String getCode() { return name(); }
    @Override
    public String getTitle() { return title; }
}
