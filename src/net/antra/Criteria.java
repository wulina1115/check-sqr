package net.antra;

import java.util.Map;

public class Criteria {

		private String FolderPath;
		public String getFolderPath() {
			return FolderPath;
		}
		public void setFolderPath(String folderPath) {
			FolderPath = folderPath;
		}
		public int getSubFolderNum() {
			return SubFolderNum;
		}
		public void setSubFolderNum(int subFolderNum) {
			SubFolderNum = subFolderNum;
		}
		public int getFileNum() {
			return FileNum;
		}
		public void setFileNum(int fileNum) {
			FileNum = fileNum;
		}
		public Map<String, Integer> getExtNum() {
			return ExtNum;
		}
		public void setExtNum(Map<String, Integer> extNum) {
			ExtNum = extNum;
		}
		private int SubFolderNum;
		private int FileNum;
		private Map<String, Integer> ExtNum;
	
		public Criteria(String FolderPath) {
			this.FolderPath = FolderPath;
		}
}
