package test;

public class Study {

    private final int limit;

    private StudyStatus status;

    private String name;

    public Study(int limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    public Study(int limit) {
        if (limit < 0) {
            throw new IllegalArgumentException("limit은 0보다 커야한다.");
        }
        this.limit = limit;
    }

    public StudyStatus getStatus() {
        return status;
    }

    public int getLimit() {
        return limit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Study{" +
                "limit=" + limit +
                ", status=" + status +
                ", name='" + name + '\'' +
                '}';
    }

}
