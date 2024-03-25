package popikr.enums;

public enum File implements EnumMapperType{
    THUMBNAILIMG("썸네일이미지"),
    POPUPIMG("팝업이미지");

    private String title;
    File(String title) { this.title = title; }

    @Override
    public String getCode() { return name(); }
    @Override
    public String getTitle() { return title; }
}
