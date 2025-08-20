package desafio_sudoku.model;

import java.util.Objects;

public class Space {
	private Integer actual;
    private final int expected;
    private final boolean fixed;
    
    public Space(int expected, boolean fixed) {
		this.expected = expected;
		this.fixed = fixed;
	}


	public Integer getActual() {
        return actual;
    }

    public void setActual(final Integer actual) {
        if (fixed) return;
        this.actual = actual;
    }

    public void clearSpace(){
        setActual(null);
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Space other = (Space) obj;
		return Objects.equals(actual, other.actual) && expected == other.expected && fixed == other.fixed;
	}
}