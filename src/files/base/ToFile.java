package files.base;

import java.io.File;

public class ToFile implements IPathAlg<File> {
	@Override
	public File root() {
		return new File("/");
	}

	@Override
	public File path(File parent, String name) {
		return new File(parent, name);
	}
}
