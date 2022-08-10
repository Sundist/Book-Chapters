package q2;

public enum StudentStatus {

    FRESHMAN("fresman"), SOPHOMORE("sophomore"), JUNIOR("junior"), SENIOR("senior");

    final String type;
    StudentStatus(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static StudentStatus findByType(String type) {
        for(StudentStatus ss : StudentStatus.values()) {
            if (ss.getType().equals(type))
                return ss;
        }
        return null;
    }

}
