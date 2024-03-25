package popikr.enums;

public enum Category implements EnumMapperType{
    FOOD("식품"),
    MOVIE("영화"),
    CHARACTER("캐릭터"),
    FASHION("패션"),
    MUSIC("음악"),
    LIVING("리빙"),
    ETC("기타");

    private String title;
    Category(String title) { this.title = title; }

    @Override
    public String getCode() { return name(); }
    @Override
    public String getTitle() { return title; }
}
