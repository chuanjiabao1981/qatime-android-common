package libraryextra.bean;

import java.io.Serializable;

/**
 * 一个图片对象
 */
public class ImageItem implements Serializable {
    public String imageId;
    public String thumbnailPath;
    public String imagePath;
    public Status status = Status.NONE;//图片上传状态

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageItem imageItem = (ImageItem) o;

        return imagePath != null ? imagePath.equals(imageItem.imagePath) : imageItem.imagePath == null;
    }

    @Override
    public int hashCode() {
        return imagePath != null ? imagePath.hashCode() : 0;
    }

    public enum Status implements Serializable {
        NONE,UPLOADING,SUCCESS,ERROR
    }
}
