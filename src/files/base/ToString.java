package files.base;

public class ToString implements IPathAlg<String> {
	@Override
	public String root() {
		return "/";
	}

	@Override
	public String path(String parent, String name) {
		return parent + "/" + name;
	}

}
