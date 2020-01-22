package folders;

import java.io.File;

public class Folders {
	
	public Folders() {
		
	}

	public void deleteFiles(String folder) {
		File file = new File(folder);
		File[] files = file.listFiles();

		try {
			for (File f : files) {
				f.delete();
			}
			System.out.println("Successfully deleted files");
		} catch (Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
		}
	}

}
