public enum Wood {
    INDIAN_ROSWOOD,
    BRAZILIAN_ROSWOOD,
    MAHOGANY,
    MAPLE,
    COCOBOLO,
    CEDAR,
    ADIRONDACK,
    ALDER,
    SITKA;

    public String toString() {
        switch (this) {
            case INDIAN_ROSWOOD:
                return "Indian Roswood";
            case BRAZILIAN_ROSWOOD:
                return "Brazilian Roswood";
            case MAHOGANY:
                return "Mahogany";
            case MAPLE:
                return "Maple";
            case COCOBOLO:
                return "Cocobolo";
            case CEDAR:
                return "Cedar";
            case ADIRONDACK:
                return "Adirondack";
            case ALDER:
                return "Alder";
            case SITKA:
                return "Sitka";
            default:
                return "";
        }
    };
}