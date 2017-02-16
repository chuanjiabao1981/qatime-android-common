package libraryextra.bean;

import java.util.List;

/**
 * 一个目录的相册对象
 * 
 */
public class ImageBucket {
	public int count = 0;
	public String bucketName;
	public List<ImageItem> imageList;
	private boolean isSelected;

	public String getFirstImagePath() {
		return imageList.get(0).imagePath;
	}

	public void setIsSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public boolean isSelected() {
		return isSelected;
	}
}
