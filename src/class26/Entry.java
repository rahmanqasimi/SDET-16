package class26;

public class Entry {
  private   String key;
  private   Double value;

    public Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key+" " +value;
    }
}
