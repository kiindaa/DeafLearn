public class Content {
    private String contentId;
    private String title;
    private String description;

    public Content(String contentId, String title, String description) {
        this.contentId = contentId;
        this.title = title;
        this.description = description;
    }

    public String getContentId() {
        return contentId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Content ID: " + contentId + ", Title: " + title + ", Description: " + description;
    }
}
