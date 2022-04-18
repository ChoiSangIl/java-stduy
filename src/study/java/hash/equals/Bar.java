package study.java.hash.equals;

import java.util.Objects;

public class Bar {
	private final int id;
	
	public Bar(int id) {
		this.id = id;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return Objects.equals(id, bar.id);
    }
}
