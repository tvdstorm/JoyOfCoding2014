package files.base;

public class Length implements IPathAlg<Integer> {
	@Override
	public Integer root() {
		return 1;
	}

	@Override
	public Integer path(Integer parent, String name) {
		return parent + 1 + name.length();
	}

}
