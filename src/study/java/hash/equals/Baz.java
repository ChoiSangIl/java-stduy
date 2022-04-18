package study.java.hash.equals;

import java.util.Objects;

public class Baz {
	private final int id;
	
	public Baz(int id) {
		this.id = id;
	}
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Baz baz = (Baz) o;
        return Objects.equals(id, baz.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
